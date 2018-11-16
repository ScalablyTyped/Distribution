package typings
package openui5Lib.sapNs.uiNs.coreNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.File")
@js.native
object FileNs extends js.Object {
  /**
             * <p>Triggers a download / save action of the given file.</p><p>There are limitations for this feature
             * in some browsers:<p><p><b>Internet Explorer 8 / 9</b><br>Some file extensions on some operating
             * systems are not working due to a bug in IE.Therefore 'txt' will be used as file extension if the
             * problem is occurring.</p><p><b>Safari (OS X / iOS)</b><br>A new window/tab will be opened. In OS X
             * the user has to manually save the file (CMD + S), choose "page source" and specify a filename.In iOS
             * the content can be opened in another app (Mail, Notes, ...) or copied to the clipboard.In case the
             * popup blocker prevents this action, an error will be thrown which can be used to notify the user to
             * disable it.</p><p><b>Android Browser</b><br>Not supported</p>
             * @param sData file content
             * @param sFileName file name
             * @param sFileExtension file extension
             * @param sMimeType file mime-type
             * @param sCharset file charset
            */
  def save(
    sData: java.lang.String,
    sFileName: java.lang.String,
    sFileExtension: java.lang.String,
    sMimeType: java.lang.String,
    sCharset: java.lang.String
  ): scala.Unit = js.native
}

