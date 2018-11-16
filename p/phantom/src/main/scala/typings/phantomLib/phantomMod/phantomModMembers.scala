package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phantom", JSImport.Namespace)
@js.native
object phantomModMembers extends js.Object {
  def create(): stdLib.Promise[PhantomJS] = js.native
  def create(args: js.Array[java.lang.String]): stdLib.Promise[PhantomJS] = js.native
  def create(args: js.Array[java.lang.String], config: phantomLib.Anon_Logger): stdLib.Promise[PhantomJS] = js.native
}

