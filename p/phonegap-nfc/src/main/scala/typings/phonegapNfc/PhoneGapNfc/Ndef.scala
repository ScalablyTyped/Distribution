package typings.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Ndef object.
  */
@js.native
trait Ndef extends js.Object {
  
   // "Sp"
  var RTD_ALTERNATIVE_CARRIER: js.Array[Double] = js.native
  
   // "ac"
  var RTD_HANDOVER_CARRIER: js.Array[Double] = js.native
  
   // "Hc"
  var RTD_HANDOVER_REQUEST: js.Array[Double] = js.native
  
   // "Hr"
  var RTD_HANDOVER_SELECT: js.Array[Double] = js.native
  
   // "U"
  var RTD_SMART_POSTER: js.Array[Double] = js.native
  
  var RTD_TEXT: js.Array[Double] = js.native
  
   // "T"
  var RTD_URI: js.Array[Double] = js.native
  
  var TNF_ABSOLUTE_URI: Double = js.native
  
  var TNF_EMPTY: Double = js.native
  
  var TNF_EXTERNAL_TYPE: Double = js.native
  
  var TNF_MIME_MEDIA: Double = js.native
  
  var TNF_RESERVED: Double = js.native
  
  var TNF_UNCHANGED: Double = js.native
  
  var TNF_UNKNOWN: Double = js.native
  
  var TNF_WELL_KNOWN: Double = js.native
  
  /**
    * Helper that creates a NdefRecord containing an absolute URI.
    *
    * An Absolute URI record means the URI describes the payload of the record.
    *
    * For example a SOAP message could use "http://schemas.xmlsoap.org/soap/envelope/"
    * as the type and XML content for the payload.
    *
    * Absolute URI can also be used to write LaunchApp records for Windows.
    *
    * See 2.4.2 Payload Type of the NDEF Specification
    * http://www.nfc-forum.org/specs/spec_list#ndefts
    *
    * Note that by default, Android will open the URI defined in the type
    * field of an Absolute URI record (TNF=3) and ignore the payload.
    * BlackBerry and Windows do not open the browser for TNF=3.
    *
    * To write a URI as the payload use ndef.uriRecord(uri)
    *
    * @param uri String
    * @param payload byte[] or String
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def absoluteUriRecord(uri: String, payload: js.Array[Double], id: js.Array[Double]): NdefRecord = js.native
  
  /**
    * Helper that creates an Android Application Record (AAR).
    * http://developer.android.com/guide/topics/connectivity/nfc/nfc.html#aar
    * @param packageName android package name
    *
    */
  def androidApplicationRecord(packageName: String): NdefRecord = js.native
  
  /**
    * Decodes an array bytes into an NDEF Message
    *
    * @param bytes Array<number> read from a NFC tag
    *
    * @return array of NdefRecord
    *
    * @see NFC Data Exchange Format (NDEF) http://www.nfc-forum.org/specs/spec_list/
    */
  def decodeMessage(bytes: js.Array[Double]): js.Array[NdefRecord] = js.native
  
  /**
    * Decode the bit flags from a TNF Byte.
    *
    * @return object with decoded data
    *
    *  See NFC Data Exchange Format (NDEF) Specification Section 3.2 RecordLayout
    */
  def decodeTnf(tnf_byte: Double): js.Any = js.native
  
  /**
    * Helper that creates an empty NdefRecord.
    *
    */
  def emptyRecord(): NdefRecord = js.native
  
  /**
    * Encodes an NDEF Message into bytes that can be written to a NFC tag.
    *
    * @param ndefRecords an Array of NdefRecord
    *
    * @return Array<number>
    *
    * @see NFC Data Exchange Format (NDEF) http://www.nfc-forum.org/specs/spec_list/
    */
  def encodeMessage(ndefRecords: js.Array[NdefRecord]): js.Array[Double] = js.native
  
  /**
    * Encode NDEF bit flags into a TNF Byte.
    *
    * @return tnf byte
    *
    *  See NFC Data Exchange Format (NDEF) Specification Section 3.2 RecordLayout
    */
  def encodeTnf(mb: Double, me: Double, cf: Double, sr: Double, il: Double, tnf: Double): Double = js.native
  
  /**
    * Helper that creates a NdefRecordcontaining an mimeMediaRecord.
    *
    * @param mimeType String
    * @param payload byte[]
    * @param id byte[] (optional)
    */
  def mimeMediaRecord(mimeType: String, payload: js.Array[Double], id: js.Array[Double]): NdefRecord = js.native
  
  /**
    * Creates a JSON representation of a NdefRecord.
    *
    * @param tnf 3-bit TNF (Type Name Format) - use one of the TNF_* constants
    * @param type array, containing zero to 255 bytes, must not be null
    * @param id byte array, containing zero to 255 bytes, must not be null
    * @param payload byte array, containing zero to (2 ** 32 - 1) bytes, must not be null
    *
    * @return NdefRecord
    *
    * @see Ndef.textRecord, Ndef.uriRecord and Ndef.mimeMediaRecord for examples
    */
  def record(tnf: Double, `type`: js.Array[Double], id: js.Array[Double], payload: js.Array[Double]): NdefRecord = js.native
  
  /**
    * Helper that creates an NDEF record containing an Smart Poster.
    *
    * @param ndefRecords array of NdefRecord
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def smartPoster(ndefRecords: js.Array[NdefRecord], id: js.Array[Double]): NdefRecord = js.native
  
  var textHelper: TextHelper = js.native
  
  /**
    * Helper that creates an NdefRecord containing plain text.
    *
    * @param text String of text to encode
    * @paramlanguageCode ISO/IANA language code. Examples: “fi”, “en-US”, “fr- CA”, “jp”. (optional)
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def textRecord(text: String, languageCode: String, id: js.Array[Double]): NdefRecord = js.native
  
  /**
    * Convert TNF to String for user friendly display
    *
    *@param tnf tnf byte
    */
  def tnfToString(tnf: Double): String = js.native
  
   // "Hs"
  var uriHelper: UriHelper = js.native
  
  /**
    * Helper that creates a NdefRecord containing a URI.
    *
    * @param uri String
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def uriRecord(uri: String, id: js.Array[Double]): NdefRecord = js.native
}
object Ndef {
  
  @scala.inline
  def apply(
    RTD_ALTERNATIVE_CARRIER: js.Array[Double],
    RTD_HANDOVER_CARRIER: js.Array[Double],
    RTD_HANDOVER_REQUEST: js.Array[Double],
    RTD_HANDOVER_SELECT: js.Array[Double],
    RTD_SMART_POSTER: js.Array[Double],
    RTD_TEXT: js.Array[Double],
    RTD_URI: js.Array[Double],
    TNF_ABSOLUTE_URI: Double,
    TNF_EMPTY: Double,
    TNF_EXTERNAL_TYPE: Double,
    TNF_MIME_MEDIA: Double,
    TNF_RESERVED: Double,
    TNF_UNCHANGED: Double,
    TNF_UNKNOWN: Double,
    TNF_WELL_KNOWN: Double,
    absoluteUriRecord: (String, js.Array[Double], js.Array[Double]) => NdefRecord,
    androidApplicationRecord: String => NdefRecord,
    decodeMessage: js.Array[Double] => js.Array[NdefRecord],
    decodeTnf: Double => js.Any,
    emptyRecord: () => NdefRecord,
    encodeMessage: js.Array[NdefRecord] => js.Array[Double],
    encodeTnf: (Double, Double, Double, Double, Double, Double) => Double,
    mimeMediaRecord: (String, js.Array[Double], js.Array[Double]) => NdefRecord,
    record: (Double, js.Array[Double], js.Array[Double], js.Array[Double]) => NdefRecord,
    smartPoster: (js.Array[NdefRecord], js.Array[Double]) => NdefRecord,
    textHelper: TextHelper,
    textRecord: (String, String, js.Array[Double]) => NdefRecord,
    tnfToString: Double => String,
    uriHelper: UriHelper,
    uriRecord: (String, js.Array[Double]) => NdefRecord
  ): Ndef = {
    val __obj = js.Dynamic.literal(RTD_ALTERNATIVE_CARRIER = RTD_ALTERNATIVE_CARRIER.asInstanceOf[js.Any], RTD_HANDOVER_CARRIER = RTD_HANDOVER_CARRIER.asInstanceOf[js.Any], RTD_HANDOVER_REQUEST = RTD_HANDOVER_REQUEST.asInstanceOf[js.Any], RTD_HANDOVER_SELECT = RTD_HANDOVER_SELECT.asInstanceOf[js.Any], RTD_SMART_POSTER = RTD_SMART_POSTER.asInstanceOf[js.Any], RTD_TEXT = RTD_TEXT.asInstanceOf[js.Any], RTD_URI = RTD_URI.asInstanceOf[js.Any], TNF_ABSOLUTE_URI = TNF_ABSOLUTE_URI.asInstanceOf[js.Any], TNF_EMPTY = TNF_EMPTY.asInstanceOf[js.Any], TNF_EXTERNAL_TYPE = TNF_EXTERNAL_TYPE.asInstanceOf[js.Any], TNF_MIME_MEDIA = TNF_MIME_MEDIA.asInstanceOf[js.Any], TNF_RESERVED = TNF_RESERVED.asInstanceOf[js.Any], TNF_UNCHANGED = TNF_UNCHANGED.asInstanceOf[js.Any], TNF_UNKNOWN = TNF_UNKNOWN.asInstanceOf[js.Any], TNF_WELL_KNOWN = TNF_WELL_KNOWN.asInstanceOf[js.Any], absoluteUriRecord = js.Any.fromFunction3(absoluteUriRecord), androidApplicationRecord = js.Any.fromFunction1(androidApplicationRecord), decodeMessage = js.Any.fromFunction1(decodeMessage), decodeTnf = js.Any.fromFunction1(decodeTnf), emptyRecord = js.Any.fromFunction0(emptyRecord), encodeMessage = js.Any.fromFunction1(encodeMessage), encodeTnf = js.Any.fromFunction6(encodeTnf), mimeMediaRecord = js.Any.fromFunction3(mimeMediaRecord), record = js.Any.fromFunction4(record), smartPoster = js.Any.fromFunction2(smartPoster), textHelper = textHelper.asInstanceOf[js.Any], textRecord = js.Any.fromFunction3(textRecord), tnfToString = js.Any.fromFunction1(tnfToString), uriHelper = uriHelper.asInstanceOf[js.Any], uriRecord = js.Any.fromFunction2(uriRecord))
    __obj.asInstanceOf[Ndef]
  }
  
  @scala.inline
  implicit class NdefOps[Self <: Ndef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRTD_ALTERNATIVE_CARRIERVarargs(value: Double*): Self = this.set("RTD_ALTERNATIVE_CARRIER", js.Array(value :_*))
    
    @scala.inline
    def setRTD_ALTERNATIVE_CARRIER(value: js.Array[Double]): Self = this.set("RTD_ALTERNATIVE_CARRIER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTD_HANDOVER_CARRIERVarargs(value: Double*): Self = this.set("RTD_HANDOVER_CARRIER", js.Array(value :_*))
    
    @scala.inline
    def setRTD_HANDOVER_CARRIER(value: js.Array[Double]): Self = this.set("RTD_HANDOVER_CARRIER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTD_HANDOVER_REQUESTVarargs(value: Double*): Self = this.set("RTD_HANDOVER_REQUEST", js.Array(value :_*))
    
    @scala.inline
    def setRTD_HANDOVER_REQUEST(value: js.Array[Double]): Self = this.set("RTD_HANDOVER_REQUEST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTD_HANDOVER_SELECTVarargs(value: Double*): Self = this.set("RTD_HANDOVER_SELECT", js.Array(value :_*))
    
    @scala.inline
    def setRTD_HANDOVER_SELECT(value: js.Array[Double]): Self = this.set("RTD_HANDOVER_SELECT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTD_SMART_POSTERVarargs(value: Double*): Self = this.set("RTD_SMART_POSTER", js.Array(value :_*))
    
    @scala.inline
    def setRTD_SMART_POSTER(value: js.Array[Double]): Self = this.set("RTD_SMART_POSTER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTD_TEXTVarargs(value: Double*): Self = this.set("RTD_TEXT", js.Array(value :_*))
    
    @scala.inline
    def setRTD_TEXT(value: js.Array[Double]): Self = this.set("RTD_TEXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTD_URIVarargs(value: Double*): Self = this.set("RTD_URI", js.Array(value :_*))
    
    @scala.inline
    def setRTD_URI(value: js.Array[Double]): Self = this.set("RTD_URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTNF_ABSOLUTE_URI(value: Double): Self = this.set("TNF_ABSOLUTE_URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTNF_EMPTY(value: Double): Self = this.set("TNF_EMPTY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTNF_EXTERNAL_TYPE(value: Double): Self = this.set("TNF_EXTERNAL_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTNF_MIME_MEDIA(value: Double): Self = this.set("TNF_MIME_MEDIA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTNF_RESERVED(value: Double): Self = this.set("TNF_RESERVED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTNF_UNCHANGED(value: Double): Self = this.set("TNF_UNCHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTNF_UNKNOWN(value: Double): Self = this.set("TNF_UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTNF_WELL_KNOWN(value: Double): Self = this.set("TNF_WELL_KNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteUriRecord(value: (String, js.Array[Double], js.Array[Double]) => NdefRecord): Self = this.set("absoluteUriRecord", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAndroidApplicationRecord(value: String => NdefRecord): Self = this.set("androidApplicationRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecodeMessage(value: js.Array[Double] => js.Array[NdefRecord]): Self = this.set("decodeMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecodeTnf(value: Double => js.Any): Self = this.set("decodeTnf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmptyRecord(value: () => NdefRecord): Self = this.set("emptyRecord", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEncodeMessage(value: js.Array[NdefRecord] => js.Array[Double]): Self = this.set("encodeMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeTnf(value: (Double, Double, Double, Double, Double, Double) => Double): Self = this.set("encodeTnf", js.Any.fromFunction6(value))
    
    @scala.inline
    def setMimeMediaRecord(value: (String, js.Array[Double], js.Array[Double]) => NdefRecord): Self = this.set("mimeMediaRecord", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRecord(value: (Double, js.Array[Double], js.Array[Double], js.Array[Double]) => NdefRecord): Self = this.set("record", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSmartPoster(value: (js.Array[NdefRecord], js.Array[Double]) => NdefRecord): Self = this.set("smartPoster", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTextHelper(value: TextHelper): Self = this.set("textHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRecord(value: (String, String, js.Array[Double]) => NdefRecord): Self = this.set("textRecord", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTnfToString(value: Double => String): Self = this.set("tnfToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUriHelper(value: UriHelper): Self = this.set("uriHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriRecord(value: (String, js.Array[Double]) => NdefRecord): Self = this.set("uriRecord", js.Any.fromFunction2(value))
  }
}
