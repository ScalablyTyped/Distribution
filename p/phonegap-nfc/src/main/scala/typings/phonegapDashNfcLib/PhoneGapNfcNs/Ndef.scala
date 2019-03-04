package typings
package phonegapDashNfcLib.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Ndef object.
  */
trait Ndef extends js.Object {
   // "Sp"
  var RTD_ALTERNATIVE_CARRIER: js.Array[scala.Double]
   // "ac"
  var RTD_HANDOVER_CARRIER: js.Array[scala.Double]
   // "Hc"
  var RTD_HANDOVER_REQUEST: js.Array[scala.Double]
   // "Hr"
  var RTD_HANDOVER_SELECT: js.Array[scala.Double]
   // "U"
  var RTD_SMART_POSTER: js.Array[scala.Double]
  var RTD_TEXT: js.Array[scala.Double]
   // "T"
  var RTD_URI: js.Array[scala.Double]
  var TNF_ABSOLUTE_URI: scala.Double
  var TNF_EMPTY: scala.Double
  var TNF_EXTERNAL_TYPE: scala.Double
  var TNF_MIME_MEDIA: scala.Double
  var TNF_RESERVED: scala.Double
  var TNF_UNCHANGED: scala.Double
  var TNF_UNKNOWN: scala.Double
  var TNF_WELL_KNOWN: scala.Double
  var textHelper: TextHelper
   // "Hs"
  var uriHelper: UriHelper
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
  def absoluteUriRecord(uri: java.lang.String, payload: js.Array[scala.Double], id: js.Array[scala.Double]): NdefRecord
  /**
    * Helper that creates an Android Application Record (AAR).
    * http://developer.android.com/guide/topics/connectivity/nfc/nfc.html#aar
    * @param packageName android package name
    *
    */
  def androidApplicationRecord(packageName: java.lang.String): NdefRecord
  /**
    * Decodes an array bytes into an NDEF Message
    *
    * @param bytes Array<number> read from a NFC tag
    *
    * @return array of NdefRecord
    *
    * @see NFC Data Exchange Format (NDEF) http://www.nfc-forum.org/specs/spec_list/
    */
  def decodeMessage(bytes: js.Array[scala.Double]): js.Array[NdefRecord]
  /**
    * Decode the bit flags from a TNF Byte.
    *
    * @return object with decoded data
    *
    *  See NFC Data Exchange Format (NDEF) Specification Section 3.2 RecordLayout
    */
  def decodeTnf(tnf_byte: scala.Double): js.Any
  /**
    * Helper that creates an empty NdefRecord.
    *
    */
  def emptyRecord(): NdefRecord
  /**
    * Encodes an NDEF Message into bytes that can be written to a NFC tag.
    *
    * @param ndefRecords an Array of NdefRecord
    *
    * @return Array<number>
    *
    * @see NFC Data Exchange Format (NDEF) http://www.nfc-forum.org/specs/spec_list/
    */
  def encodeMessage(ndefRecords: js.Array[NdefRecord]): js.Array[scala.Double]
  /**
    * Encode NDEF bit flags into a TNF Byte.
    *
    * @return tnf byte
    *
    *  See NFC Data Exchange Format (NDEF) Specification Section 3.2 RecordLayout
    */
  def encodeTnf(
    mb: scala.Double,
    me: scala.Double,
    cf: scala.Double,
    sr: scala.Double,
    il: scala.Double,
    tnf: scala.Double
  ): scala.Double
  /**
    * Helper that creates a NdefRecordcontaining an mimeMediaRecord.
    *
    * @param mimeType String
    * @param payload byte[]
    * @param id byte[] (optional)
    */
  def mimeMediaRecord(mimeType: java.lang.String, payload: js.Array[scala.Double], id: js.Array[scala.Double]): NdefRecord
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
  def record(
    tnf: scala.Double,
    `type`: js.Array[scala.Double],
    id: js.Array[scala.Double],
    payload: js.Array[scala.Double]
  ): NdefRecord
  /**
    * Helper that creates an NDEF record containing an Smart Poster.
    *
    * @param ndefRecords array of NdefRecord
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def smartPoster(ndefRecords: js.Array[NdefRecord], id: js.Array[scala.Double]): NdefRecord
  /**
    * Helper that creates an NdefRecord containing plain text.
    *
    * @param text String of text to encode
    * @paramlanguageCode ISO/IANA language code. Examples: “fi”, “en-US”, “fr- CA”, “jp”. (optional)
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def textRecord(text: java.lang.String, languageCode: java.lang.String, id: js.Array[scala.Double]): NdefRecord
  /**
    * Convert TNF to String for user friendly display
    *
    *@param tnf tnf byte
    */
  def tnfToString(tnf: scala.Double): java.lang.String
  /**
    * Helper that creates a NdefRecord containing a URI.
    *
    * @param uri String
    * @param id byte[] (optional)
    *
    * @return NdefRecord
    */
  def uriRecord(uri: java.lang.String, id: js.Array[scala.Double]): NdefRecord
}

object Ndef {
  @scala.inline
  def apply(
    RTD_ALTERNATIVE_CARRIER: js.Array[scala.Double],
    RTD_HANDOVER_CARRIER: js.Array[scala.Double],
    RTD_HANDOVER_REQUEST: js.Array[scala.Double],
    RTD_HANDOVER_SELECT: js.Array[scala.Double],
    RTD_SMART_POSTER: js.Array[scala.Double],
    RTD_TEXT: js.Array[scala.Double],
    RTD_URI: js.Array[scala.Double],
    TNF_ABSOLUTE_URI: scala.Double,
    TNF_EMPTY: scala.Double,
    TNF_EXTERNAL_TYPE: scala.Double,
    TNF_MIME_MEDIA: scala.Double,
    TNF_RESERVED: scala.Double,
    TNF_UNCHANGED: scala.Double,
    TNF_UNKNOWN: scala.Double,
    TNF_WELL_KNOWN: scala.Double,
    absoluteUriRecord: js.Function3[java.lang.String, js.Array[scala.Double], js.Array[scala.Double], NdefRecord],
    androidApplicationRecord: js.Function1[java.lang.String, NdefRecord],
    decodeMessage: js.Function1[js.Array[scala.Double], js.Array[NdefRecord]],
    decodeTnf: js.Function1[scala.Double, js.Any],
    emptyRecord: js.Function0[NdefRecord],
    encodeMessage: js.Function1[js.Array[NdefRecord], js.Array[scala.Double]],
    encodeTnf: js.Function6[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ],
    mimeMediaRecord: js.Function3[java.lang.String, js.Array[scala.Double], js.Array[scala.Double], NdefRecord],
    record: js.Function4[
      scala.Double, 
      js.Array[scala.Double], 
      js.Array[scala.Double], 
      js.Array[scala.Double], 
      NdefRecord
    ],
    smartPoster: js.Function2[js.Array[NdefRecord], js.Array[scala.Double], NdefRecord],
    textHelper: TextHelper,
    textRecord: js.Function3[java.lang.String, java.lang.String, js.Array[scala.Double], NdefRecord],
    tnfToString: js.Function1[scala.Double, java.lang.String],
    uriHelper: UriHelper,
    uriRecord: js.Function2[java.lang.String, js.Array[scala.Double], NdefRecord]
  ): Ndef = {
    val __obj = js.Dynamic.literal(RTD_ALTERNATIVE_CARRIER = RTD_ALTERNATIVE_CARRIER, RTD_HANDOVER_CARRIER = RTD_HANDOVER_CARRIER, RTD_HANDOVER_REQUEST = RTD_HANDOVER_REQUEST, RTD_HANDOVER_SELECT = RTD_HANDOVER_SELECT, RTD_SMART_POSTER = RTD_SMART_POSTER, RTD_TEXT = RTD_TEXT, RTD_URI = RTD_URI, TNF_ABSOLUTE_URI = TNF_ABSOLUTE_URI, TNF_EMPTY = TNF_EMPTY, TNF_EXTERNAL_TYPE = TNF_EXTERNAL_TYPE, TNF_MIME_MEDIA = TNF_MIME_MEDIA, TNF_RESERVED = TNF_RESERVED, TNF_UNCHANGED = TNF_UNCHANGED, TNF_UNKNOWN = TNF_UNKNOWN, TNF_WELL_KNOWN = TNF_WELL_KNOWN, absoluteUriRecord = absoluteUriRecord, androidApplicationRecord = androidApplicationRecord, decodeMessage = decodeMessage, decodeTnf = decodeTnf, emptyRecord = emptyRecord, encodeMessage = encodeMessage, encodeTnf = encodeTnf, mimeMediaRecord = mimeMediaRecord, record = record, smartPoster = smartPoster, textHelper = textHelper, textRecord = textRecord, tnfToString = tnfToString, uriHelper = uriHelper, uriRecord = uriRecord)
  
    __obj.asInstanceOf[Ndef]
  }
}

