package typings.phonegapNfc

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PhoneGapNfc {
  
  /**
    * The Ndef object.
    */
  @js.native
  trait Ndef extends StObject {
    
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
    implicit class NdefMutableBuilder[Self <: Ndef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsoluteUriRecord(value: (String, js.Array[Double], js.Array[Double]) => NdefRecord): Self = StObject.set(x, "absoluteUriRecord", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAndroidApplicationRecord(value: String => NdefRecord): Self = StObject.set(x, "androidApplicationRecord", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecodeMessage(value: js.Array[Double] => js.Array[NdefRecord]): Self = StObject.set(x, "decodeMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecodeTnf(value: Double => js.Any): Self = StObject.set(x, "decodeTnf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmptyRecord(value: () => NdefRecord): Self = StObject.set(x, "emptyRecord", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEncodeMessage(value: js.Array[NdefRecord] => js.Array[Double]): Self = StObject.set(x, "encodeMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeTnf(value: (Double, Double, Double, Double, Double, Double) => Double): Self = StObject.set(x, "encodeTnf", js.Any.fromFunction6(value))
      
      @scala.inline
      def setMimeMediaRecord(value: (String, js.Array[Double], js.Array[Double]) => NdefRecord): Self = StObject.set(x, "mimeMediaRecord", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRTD_ALTERNATIVE_CARRIER(value: js.Array[Double]): Self = StObject.set(x, "RTD_ALTERNATIVE_CARRIER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTD_ALTERNATIVE_CARRIERVarargs(value: Double*): Self = StObject.set(x, "RTD_ALTERNATIVE_CARRIER", js.Array(value :_*))
      
      @scala.inline
      def setRTD_HANDOVER_CARRIER(value: js.Array[Double]): Self = StObject.set(x, "RTD_HANDOVER_CARRIER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTD_HANDOVER_CARRIERVarargs(value: Double*): Self = StObject.set(x, "RTD_HANDOVER_CARRIER", js.Array(value :_*))
      
      @scala.inline
      def setRTD_HANDOVER_REQUEST(value: js.Array[Double]): Self = StObject.set(x, "RTD_HANDOVER_REQUEST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTD_HANDOVER_REQUESTVarargs(value: Double*): Self = StObject.set(x, "RTD_HANDOVER_REQUEST", js.Array(value :_*))
      
      @scala.inline
      def setRTD_HANDOVER_SELECT(value: js.Array[Double]): Self = StObject.set(x, "RTD_HANDOVER_SELECT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTD_HANDOVER_SELECTVarargs(value: Double*): Self = StObject.set(x, "RTD_HANDOVER_SELECT", js.Array(value :_*))
      
      @scala.inline
      def setRTD_SMART_POSTER(value: js.Array[Double]): Self = StObject.set(x, "RTD_SMART_POSTER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTD_SMART_POSTERVarargs(value: Double*): Self = StObject.set(x, "RTD_SMART_POSTER", js.Array(value :_*))
      
      @scala.inline
      def setRTD_TEXT(value: js.Array[Double]): Self = StObject.set(x, "RTD_TEXT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTD_TEXTVarargs(value: Double*): Self = StObject.set(x, "RTD_TEXT", js.Array(value :_*))
      
      @scala.inline
      def setRTD_URI(value: js.Array[Double]): Self = StObject.set(x, "RTD_URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRTD_URIVarargs(value: Double*): Self = StObject.set(x, "RTD_URI", js.Array(value :_*))
      
      @scala.inline
      def setRecord(value: (Double, js.Array[Double], js.Array[Double], js.Array[Double]) => NdefRecord): Self = StObject.set(x, "record", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSmartPoster(value: (js.Array[NdefRecord], js.Array[Double]) => NdefRecord): Self = StObject.set(x, "smartPoster", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTNF_ABSOLUTE_URI(value: Double): Self = StObject.set(x, "TNF_ABSOLUTE_URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTNF_EMPTY(value: Double): Self = StObject.set(x, "TNF_EMPTY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTNF_EXTERNAL_TYPE(value: Double): Self = StObject.set(x, "TNF_EXTERNAL_TYPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTNF_MIME_MEDIA(value: Double): Self = StObject.set(x, "TNF_MIME_MEDIA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTNF_RESERVED(value: Double): Self = StObject.set(x, "TNF_RESERVED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTNF_UNCHANGED(value: Double): Self = StObject.set(x, "TNF_UNCHANGED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTNF_UNKNOWN(value: Double): Self = StObject.set(x, "TNF_UNKNOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTNF_WELL_KNOWN(value: Double): Self = StObject.set(x, "TNF_WELL_KNOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextHelper(value: TextHelper): Self = StObject.set(x, "textHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextRecord(value: (String, String, js.Array[Double]) => NdefRecord): Self = StObject.set(x, "textRecord", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTnfToString(value: Double => String): Self = StObject.set(x, "tnfToString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUriHelper(value: UriHelper): Self = StObject.set(x, "uriHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriRecord(value: (String, js.Array[Double]) => NdefRecord): Self = StObject.set(x, "uriRecord", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait NdefRecord extends StObject {
    
    /**
      * byte array, containing zero to 255 bytes, must not be null
      */
    var id: js.Array[Double] = js.native
    
    /**
      * byte array, containing zero to (2 ** 32 - 1) bytes, must not be null
      */
    var payload: js.Array[Double] = js.native
    
    /**
      * 3-bit TNF (Type Name Format) - use one of the TNF_* constants
      */
    var tnf: Double = js.native
    
    /**
      * byte array, containing zero to 255 bytes, must not be null
      */
    var `type`: js.Array[Double] = js.native
  }
  object NdefRecord {
    
    @scala.inline
    def apply(id: js.Array[Double], payload: js.Array[Double], tnf: Double, `type`: js.Array[Double]): NdefRecord = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tnf = tnf.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NdefRecord]
    }
    
    @scala.inline
    implicit class NdefRecordMutableBuilder[Self <: NdefRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: js.Array[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdVarargs(value: Double*): Self = StObject.set(x, "id", js.Array(value :_*))
      
      @scala.inline
      def setPayload(value: js.Array[Double]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadVarargs(value: Double*): Self = StObject.set(x, "payload", js.Array(value :_*))
      
      @scala.inline
      def setTnf(value: Double): Self = StObject.set(x, "tnf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Array[Double]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(value: Double*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NdefTag extends Tag {
    
    var canMakeReadOnly: Boolean = js.native
    
    var isWritable: Boolean = js.native
    
    var maxSize: Double = js.native
    
    var ndefMessage: js.Array[NdefRecord] = js.native
  }
  object NdefTag {
    
    @scala.inline
    def apply(
      canMakeReadOnly: Boolean,
      date: String,
      id: js.Array[Double],
      isWritable: Boolean,
      maxSize: Double,
      ndefMessage: js.Array[NdefRecord],
      techTypes: js.Array[String],
      `type`: String
    ): NdefTag = {
      val __obj = js.Dynamic.literal(canMakeReadOnly = canMakeReadOnly.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isWritable = isWritable.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], ndefMessage = ndefMessage.asInstanceOf[js.Any], techTypes = techTypes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NdefTag]
    }
    
    @scala.inline
    implicit class NdefTagMutableBuilder[Self <: NdefTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanMakeReadOnly(value: Boolean): Self = StObject.set(x, "canMakeReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWritable(value: Boolean): Self = StObject.set(x, "isWritable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNdefMessage(value: js.Array[NdefRecord]): Self = StObject.set(x, "ndefMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNdefMessageVarargs(value: NdefRecord*): Self = StObject.set(x, "ndefMessage", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NdefTagEvent extends TagEvent {
    
    @JSName("tag")
    var tag_NdefTagEvent: NdefTag = js.native
  }
  
  /**
    * The Nfc object.
    */
  @js.native
  trait Nfc extends Util {
    
    /**
      * Function nfc.addMimeTypeListener registers the callback for ndef-mime events.
      * A ndef-mime event occurs when a Ndef.TNF_MIME_MEDIA tag is read and matches the specified MIME type.
      * This function can be called multiple times to register different MIME types. You should use the same handler for all MIME messages.
      * @param mimeType The MIME type to filter for messages.
      * @param callback The callback that is called when an NDEF tag matching the MIME type is read.
      * @param win The callback that is called when the listener is added.
      * @param fail The callback that is called if there was an error.
      */
    def addMimeTypeListener(mimeType: String, callback: js.Function0[Unit]): Unit = js.native
    def addMimeTypeListener(
      mimeType: String,
      callback: js.Function0[Unit],
      win: js.UndefOr[scala.Nothing],
      fail: js.Function0[Unit]
    ): Unit = js.native
    def addMimeTypeListener(mimeType: String, callback: js.Function0[Unit], win: js.Function0[Unit]): Unit = js.native
    def addMimeTypeListener(mimeType: String, callback: js.Function0[Unit], win: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
    
    /**
      * Function nfc.addNdefFormatableListener registers the callback for ndef-formatable events.
      * A ndef-formatable event occurs when a tag is read that can be NDEF formatted.
      * This is not fired for tags that are already formatted as NDEF.
      * The ndef-formatable event will not contain an NdefMessage.
      * @param callback The callback that is called when NDEF formatable tag is read.
      * @param win The callback that is called when the listener is added.
      * @param fail The callback that is called if there was an error.
      */
    def addNdefFormatableListener(callback: js.Function1[/* event */ NdefTagEvent, Unit]): Unit = js.native
    def addNdefFormatableListener(
      callback: js.Function1[/* event */ NdefTagEvent, Unit],
      win: js.UndefOr[scala.Nothing],
      fail: js.Function0[Unit]
    ): Unit = js.native
    def addNdefFormatableListener(callback: js.Function1[/* event */ NdefTagEvent, Unit], win: js.Function0[Unit]): Unit = js.native
    def addNdefFormatableListener(
      callback: js.Function1[/* event */ NdefTagEvent, Unit],
      win: js.Function0[Unit],
      fail: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Function nfc.addNdefListener registers the callback for ndef events.
      * A ndef event is fired when a NDEF tag is read.
      * For BlackBerry 10, you must configure the type of tags your application will read with an invoke-target in config.xml.
      * On Android registered mimeTypeListeners takes precedence over this more generic NDEF listener.
      * @param callback The callback that is called when an NDEF tag is read.
      * @param win The callback that is called when the listener is added.
      * @param fail The callback that is called if there was an error.
      */
    def addNdefListener(callback: js.Function1[/* event */ NdefTagEvent, Unit]): Unit = js.native
    def addNdefListener(
      callback: js.Function1[/* event */ NdefTagEvent, Unit],
      win: js.UndefOr[scala.Nothing],
      fail: js.Function0[Unit]
    ): Unit = js.native
    def addNdefListener(callback: js.Function1[/* event */ NdefTagEvent, Unit], win: js.Function0[Unit]): Unit = js.native
    def addNdefListener(
      callback: js.Function1[/* event */ NdefTagEvent, Unit],
      win: js.Function0[Unit],
      fail: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Function nfc.addTagDiscoveredListener registers the callback for tag events.
      * This event occurs when any tag is detected by the phone
      * @param callback The callback that is called when a tag is detected.
      * @param win The callback that is called when the listener is added.
      * @param fail The callback that is called if there was an error.
      */
    def addTagDiscoveredListener(callback: js.Function1[/* event */ TagEvent, Unit]): Unit = js.native
    def addTagDiscoveredListener(
      callback: js.Function1[/* event */ TagEvent, Unit],
      win: js.UndefOr[scala.Nothing],
      fail: js.Function0[Unit]
    ): Unit = js.native
    def addTagDiscoveredListener(callback: js.Function1[/* event */ TagEvent, Unit], win: js.Function0[Unit]): Unit = js.native
    def addTagDiscoveredListener(
      callback: js.Function1[/* event */ TagEvent, Unit],
      win: js.Function0[Unit],
      fail: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Function nfc.enabled explicitly checks to see if the phone has NFC and if NFC is enabled.
      * If everything is OK, the success callback is called.
      * If there is a problem, the failure callback will be called with a reason code.
      * The reason will be NO_NFC if the device doesn't support NFC and NFC_DISABLED if the user has disabled NFC.
      * Note: that on Android the NFC status is checked before every API call NO_NFC or NFC_DISABLED can be returned in any failure function.
      * Windows will return NO_NFC_OR_NFC_DISABLED when NFC is not present or disabled.
      * If the user disabled NFC after the application started, Windows may return NFC_DISABLED.
      * Windows checks the NFC status before most API calls, but there are some cases when the NFC state can not be determined.
      * @param win The callback that is called when NFC is enabled.
      * @param fail The callback that is called when NFC is disabled or missing.
      */
    def enabled(): Unit = js.native
    def enabled(win: js.UndefOr[scala.Nothing], fail: js.Function1[/* status */ String, Unit]): Unit = js.native
    def enabled(win: js.Function1[/* status */ String, Unit]): Unit = js.native
    def enabled(win: js.Function1[/* status */ String, Unit], fail: js.Function1[/* status */ String, Unit]): Unit = js.native
    
    /**
      * Function nfc.erase erases a tag by writing an empty message.
      * Will format unformatted tags before writing.
      * This method must be called from within an NDEF TagEvent Handler.
      * @param win The callback that is called when sharing stops.
      * @param fail The callback that is called if there was an error.
      */
    def erase(): Unit = js.native
    def erase(win: js.UndefOr[scala.Nothing], fail: js.Function0[Unit]): Unit = js.native
    def erase(win: js.Function0[Unit]): Unit = js.native
    def erase(win: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
    
    /**
      * Function nfc.handover shares files to a NFC peer using handover. Files are sent by specifying a file:// or context:// URI or a list of URIs.
      * The file transfer is initiated with NFC but the transfer is completed with over Bluetooth or WiFi which is handled by a NFC handover request.
      * The Android code is responsible for building the handover NFC Message.
      * This is Android only, but it should be possible to add implementations for other platforms.
      * @param uris A URI as a String, or an array of URIs.
      * @param win The callback that is called when the message is pushed.
      * @param fail The callback that is called if there was an error.
      */
    def handover(uris: String): Unit = js.native
    def handover(uris: String, win: js.UndefOr[scala.Nothing], fail: js.Function0[Unit]): Unit = js.native
    def handover(uris: String, win: js.Function0[Unit]): Unit = js.native
    def handover(uris: String, win: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
    def handover(uris: js.Array[String]): Unit = js.native
    def handover(uris: js.Array[String], win: js.UndefOr[scala.Nothing], fail: js.Function0[Unit]): Unit = js.native
    def handover(uris: js.Array[String], win: js.Function0[Unit]): Unit = js.native
    def handover(uris: js.Array[String], win: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
    
    /**
      * Function nfc.makeReadOnly make a NFC tag read only.
      * Warning this is permanent and can not be undone.
      * On Android this method must be called from within an NDEF TagEvent Handler.
      * @param win The callback that is called when the tag is locked.
      * @param fail The callback that is called if there was an error.
      */
    def makeReadOnly(): Unit = js.native
    def makeReadOnly(win: js.UndefOr[scala.Nothing], fail: js.Function0[Unit]): Unit = js.native
    def makeReadOnly(win: js.Function0[Unit]): Unit = js.native
    def makeReadOnly(win: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
    
    /**
      * Removes the previously registered event listener added via nfc.addMimeTypeListener
      * @param mimeType The MIME type to filter for messages.
      * @param callback The previously registered callback.
      * @param win The callback that is called when the listener is successfully removed.
      * @param fail The callback that is called if there was an error during removal.
      */
    def removeMimeTypeListener(mimeType: String, callback: js.Function1[/* event */ TagEvent, Unit]): Unit = js.native
    def removeMimeTypeListener(
      mimeType: String,
      callback: js.Function1[/* event */ TagEvent, Unit],
      win: js.UndefOr[scala.Nothing],
      fail: js.Function0[Unit]
    ): Unit = js.native
    def removeMimeTypeListener(mimeType: String, callback: js.Function1[/* event */ TagEvent, Unit], win: js.Function0[Unit]): Unit = js.native
    def removeMimeTypeListener(
      mimeType: String,
      callback: js.Function1[/* event */ TagEvent, Unit],
      win: js.Function0[Unit],
      fail: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Removes the previously registered event listener for NDEF tags added via nfc.addNdefListener.
      * @param callback The previously registered callback.
      * @param win The callback that is called when the listener is successfully removed.
      * @param fail The callback that is called if there was an error during removal.
      */
    def removeNdefListener(callback: js.Function1[/* event */ TagEvent, Unit]): Unit = js.native
    def removeNdefListener(
      callback: js.Function1[/* event */ TagEvent, Unit],
      win: js.UndefOr[scala.Nothing],
      fail: js.Function0[Unit]
    ): Unit = js.native
    def removeNdefListener(callback: js.Function1[/* event */ TagEvent, Unit], win: js.Function0[Unit]): Unit = js.native
    def removeNdefListener(
      callback: js.Function1[/* event */ TagEvent, Unit],
      win: js.Function0[Unit],
      fail: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Removes the previously registered event listener added via nfc.addTagDiscoveredListener
      * @param callback The previously registered callback.
      * @param win The callback that is called when the listener is successfully removed.
      * @param fail The callback that is called if there was an error during removal.
      */
    def removeTagDiscoveredListener(callback: js.Function1[/* event */ TagEvent, Unit]): Unit = js.native
    def removeTagDiscoveredListener(
      callback: js.Function1[/* event */ TagEvent, Unit],
      win: js.UndefOr[scala.Nothing],
      fail: js.Function0[Unit]
    ): Unit = js.native
    def removeTagDiscoveredListener(callback: js.Function1[/* event */ TagEvent, Unit], win: js.Function0[Unit]): Unit = js.native
    def removeTagDiscoveredListener(
      callback: js.Function1[/* event */ TagEvent, Unit],
      win: js.Function0[Unit],
      fail: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Function nfc.share writes an NdefMessage via peer-to-peer.
      * This should appear as an NFC tag to another device.
      * @param ndefMessage An array of NDEF Records.
      * @param win The callback that is called when the message is pushed.
      * @param fail The callback that is called if there was an error.
      */
    def share(ndefMessage: js.Array[NdefRecord]): Unit = js.native
    def share(ndefMessage: js.Array[NdefRecord], win: js.UndefOr[scala.Nothing], fail: js.Function0[Unit]): Unit = js.native
    def share(ndefMessage: js.Array[NdefRecord], win: js.Function0[Unit]): Unit = js.native
    def share(ndefMessage: js.Array[NdefRecord], win: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
    
    /**
      * Function showSettings opens the NFC settings for the operating system.
      * @param win Success callback function
      * @param fail Error callback function, invoked when error occurs.
      */
    def showSettings(): Unit = js.native
    def showSettings(win: js.UndefOr[scala.Nothing], fail: js.Function0[Unit]): Unit = js.native
    def showSettings(win: js.Function0[Unit]): Unit = js.native
    def showSettings(win: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
    
    /**
      * Function nfc.stopHandover stops sharing data via peer-to-peer.
      * @param win The callback that is called when sharing stops.
      * @param fail The callback that is called if there was an error.
      */
    def stopHandover(): Unit = js.native
    def stopHandover(win: js.UndefOr[scala.Nothing], fail: js.Function0[Unit]): Unit = js.native
    def stopHandover(win: js.Function0[Unit]): Unit = js.native
    def stopHandover(win: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
    
    /**
      * Function nfc.unshare stops sharing data via peer-to-peer.
      * @param win The callback that is called when sharing stops.
      * @param fail The callback that is called if there was an error.
      */
    def unshare(): Unit = js.native
    def unshare(win: js.UndefOr[scala.Nothing], fail: js.Function0[Unit]): Unit = js.native
    def unshare(win: js.Function0[Unit]): Unit = js.native
    def unshare(win: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
    
    /**
      * Function nfc.write writes an NdefMessage to a NFC tag.
      * On Android this method must be called from within an NDEF TagEvent Handler.
      * On Windows this method may be called from within the NDEF TagEvent Handler.
      * On Windows Phone 8.1 this method should be called outside the NDEF TagEvent Handler,
      * otherwise Windows tries to read the tag contents as you are writing to the tag.
      * @param ndefMessage An array of NDEF Records.
      * @param win The callback that is called when the tag is written.
      * @param fail The callback that is called if there was an error.
      */
    def write(ndefMessage: js.Array[NdefRecord]): Unit = js.native
    def write(ndefMessage: js.Array[NdefRecord], win: js.UndefOr[scala.Nothing], fail: js.Function0[Unit]): Unit = js.native
    def write(ndefMessage: js.Array[NdefRecord], win: js.Function0[Unit]): Unit = js.native
    def write(ndefMessage: js.Array[NdefRecord], win: js.Function0[Unit], fail: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait Tag extends StObject {
    
    var date: String = js.native
    
    var id: js.Array[Double] = js.native
    
    var techTypes: js.Array[String] = js.native
    
    var `type`: String = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(date: String, id: js.Array[Double], techTypes: js.Array[String], `type`: String): Tag = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], techTypes = techTypes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: js.Array[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdVarargs(value: Double*): Self = StObject.set(x, "id", js.Array(value :_*))
      
      @scala.inline
      def setTechTypes(value: js.Array[String]): Self = StObject.set(x, "techTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTechTypesVarargs(value: String*): Self = StObject.set(x, "techTypes", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TagEvent extends Event {
    
    var tag: Tag = js.native
  }
  
  @js.native
  trait TextHelper extends StObject {
    
    /**
      * Decode a URI payload bytes
      * @param data
      */
    def decodePayload(data: js.Any): String = js.native
    
    /**
      * Encode text payload
      * @param text
      * @param lang
      * @param encoding
      */
    def encodePayload(text: String, lang: String, encoding: String): js.Array[Double] = js.native
  }
  object TextHelper {
    
    @scala.inline
    def apply(decodePayload: js.Any => String, encodePayload: (String, String, String) => js.Array[Double]): TextHelper = {
      val __obj = js.Dynamic.literal(decodePayload = js.Any.fromFunction1(decodePayload), encodePayload = js.Any.fromFunction3(encodePayload))
      __obj.asInstanceOf[TextHelper]
    }
    
    @scala.inline
    implicit class TextHelperMutableBuilder[Self <: TextHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecodePayload(value: js.Any => String): Self = StObject.set(x, "decodePayload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodePayload(value: (String, String, String) => js.Array[Double]): Self = StObject.set(x, "encodePayload", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait UriHelper extends StObject {
    
    /**
      * Decode a URI payload bytes
      * @param data
      */
    def decodePayload(data: js.Any): String = js.native
    
    /**
      * shorten a URI with standard prefix
      * @param uri
      */
    def encodePayload(uri: String): js.Array[Double] = js.native
    
    /**
      * URI identifier codes from URI Record Type Definition NFCForum-TS-RTD_URI_1.0 2006-07-24
      * index in array matches code in the spec
      */
    var protocols: js.Array[String] = js.native
  }
  object UriHelper {
    
    @scala.inline
    def apply(
      decodePayload: js.Any => String,
      encodePayload: String => js.Array[Double],
      protocols: js.Array[String]
    ): UriHelper = {
      val __obj = js.Dynamic.literal(decodePayload = js.Any.fromFunction1(decodePayload), encodePayload = js.Any.fromFunction1(encodePayload), protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[UriHelper]
    }
    
    @scala.inline
    implicit class UriHelperMutableBuilder[Self <: UriHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecodePayload(value: js.Any => String): Self = StObject.set(x, "decodePayload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodePayload(value: String => js.Array[Double]): Self = StObject.set(x, "encodePayload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Util extends StObject {
    
    /**
      * Convert bytes to hexadecimal string
      * @param bytes
      */
    def bytesToHexString(bytes: js.Array[Double]): String = js.native
    
    /**
      * Convert bytes to string
      * @param bytes
      */
    def bytesToString(bytes: js.Array[Double]): String = js.native
    
    /**
      * Convert string to bytes
      * @param string
      */
    def stringToBytes(string: String): js.Array[Double] = js.native
  }
  object Util {
    
    @scala.inline
    def apply(
      bytesToHexString: js.Array[Double] => String,
      bytesToString: js.Array[Double] => String,
      stringToBytes: String => js.Array[Double]
    ): Util = {
      val __obj = js.Dynamic.literal(bytesToHexString = js.Any.fromFunction1(bytesToHexString), bytesToString = js.Any.fromFunction1(bytesToString), stringToBytes = js.Any.fromFunction1(stringToBytes))
      __obj.asInstanceOf[Util]
    }
    
    @scala.inline
    implicit class UtilMutableBuilder[Self <: Util] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesToHexString(value: js.Array[Double] => String): Self = StObject.set(x, "bytesToHexString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBytesToString(value: js.Array[Double] => String): Self = StObject.set(x, "bytesToString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringToBytes(value: String => js.Array[Double]): Self = StObject.set(x, "stringToBytes", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Global object NFC.
    */
  @js.native
  trait Window extends StObject {
    
    def fireNfcTagEvent(event: TagEvent, tagAsJson: String): Unit = js.native
    
    var ndef: Ndef = js.native
    
    var nfc: Nfc = js.native
    
    var util: Util = js.native
  }
  object Window {
    
    @scala.inline
    def apply(fireNfcTagEvent: (TagEvent, String) => Unit, ndef: Ndef, nfc: Nfc, util: Util): Window = {
      val __obj = js.Dynamic.literal(fireNfcTagEvent = js.Any.fromFunction2(fireNfcTagEvent), ndef = ndef.asInstanceOf[js.Any], nfc = nfc.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFireNfcTagEvent(value: (TagEvent, String) => Unit): Self = StObject.set(x, "fireNfcTagEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNdef(value: Ndef): Self = StObject.set(x, "ndef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNfc(value: Nfc): Self = StObject.set(x, "nfc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtil(value: Util): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    }
  }
}
