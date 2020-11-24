package typings.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
