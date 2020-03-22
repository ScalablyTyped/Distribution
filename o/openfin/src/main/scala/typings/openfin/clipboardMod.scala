package typings.openfin

import typings.openfin.baseMod.Base
import typings.openfin.writeRequestMod.WriteAnyRequestType
import typings.openfin.writeRequestMod.WriteRequestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/clipboard/clipboard", JSImport.Namespace)
@js.native
object clipboardMod extends js.Object {
  @js.native
  trait Clipboard extends Base {
    /**
      * Reads available formats for the clipboard type
      * @param { string } type Clipboard Type
      * @return {Promise.Array.<string>}
      * @tutorial Clipboard.getAvailableFormats
      */
    def getAvailableFormats(): js.Promise[js.Array[String]] = js.native
    def getAvailableFormats(`type`: String): js.Promise[js.Array[String]] = js.native
    /**
      * Read the content of the clipboard as Html
      * @param { string } type Clipboard Type
      * @return {Promise.<string>}
      * @tutorial Clipboard.readHtml
      */
    def readHtml(): js.Promise[String] = js.native
    def readHtml(`type`: String): js.Promise[String] = js.native
    /**
      * Read the content of the clipboard as Rtf
      * @param { string } type Clipboard Type
      * @return {Promise.<string>}
      * @tutorial Clipboard.readRtf
      */
    def readRtf(): js.Promise[String] = js.native
    def readRtf(`type`: String): js.Promise[String] = js.native
    /**
      * Read the content of the clipboard as plain text
      * @param { string } type Clipboard Type
      * @return {Promise.<string>}
      * @tutorial Clipboard.readText
      */
    def readText(): js.Promise[String] = js.native
    def readText(`type`: String): js.Promise[String] = js.native
    /**
      * Writes data into the clipboard
      * @param { WriteRequestType } writeObj This object is described in the WriteRequestType typedef
      * @return {Promise.<void>}
      * @tutorial Clipboard.write
      */
    def write(writeObj: WriteAnyRequestType): js.Promise[Unit] = js.native
    /**
      * Writes data into the clipboard as Html
      * @param { WriteRequestType } writeObj This object is described in the WriteRequestType typedef
      * @return {Promise.<void>}
      * @tutorial Clipboard.writeHtml
      */
    def writeHtml(writeObj: WriteRequestType): js.Promise[Unit] = js.native
    /**
      * Writes data into the clipboard as Rtf
      * @param { WriteRequestType } writeObj This object is described in the WriteRequestType typedef
      * @return {Promise.<void>}
      * @tutorial Clipboard.writeRtf
      */
    def writeRtf(writeObj: WriteRequestType): js.Promise[Unit] = js.native
    /**
      * Writes data into the clipboard as plain text
      * @param { WriteRequestType } writeObj This object is described in the WriteRequestType typeof
      * @return {Promise.<void>}
      * @tutorial Clipboard.writeText
      */
    def writeText(writeObj: WriteRequestType): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default () extends Clipboard
  
}

