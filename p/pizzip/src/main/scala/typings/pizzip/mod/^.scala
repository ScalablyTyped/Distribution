package typings.pizzip.mod

import typings.pizzip.anon.Arraybuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pizzip", JSImport.Namespace)
@js.native
class ^ () extends PizZip {
  /**
    * Specifying data & options is a shortcut for new PizZip().load(data, options);
    *
    * @param data the zip file
    * @param options the options to load the zip file
    */
  // tslint:disable-next-line unified-signatures new (undefined, {options}) is not an acceptable input
  def this(data: LoadData) = this()
  def this(data: LoadData, options: LoadOptions) = this()
}

@JSImport("pizzip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * If the browser supports them, PizZip can take advantage of some "new" features : ArrayBuffer, Blob, Uint8Array.
    * To know if PizZip can use them, you can check the PizZip.support object.
    */
  var support: Arraybuffer = js.native
}

