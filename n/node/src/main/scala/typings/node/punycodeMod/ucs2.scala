package typings.node.punycodeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ucs2 extends js.Object {
  
  /**
    * @deprecated since v7.0.0
    * The version of the punycode module bundled in Node.js is being deprecated.
    * In a future major version of Node.js this module will be removed.
    * Users currently depending on the punycode module should switch to using
    * the userland-provided Punycode.js module instead.
    */
  def decode(string: String): js.Array[Double] = js.native
  
  /**
    * @deprecated since v7.0.0
    * The version of the punycode module bundled in Node.js is being deprecated.
    * In a future major version of Node.js this module will be removed.
    * Users currently depending on the punycode module should switch to using
    * the userland-provided Punycode.js module instead.
    */
  def encode(codePoints: js.Array[Double]): String = js.native
}
/**
  * @deprecated since v7.0.0
  * The version of the punycode module bundled in Node.js is being deprecated.
  * In a future major version of Node.js this module will be removed.
  * Users currently depending on the punycode module should switch to using
  * the userland-provided Punycode.js module instead.
  */
@JSImport("punycode", "ucs2")
@js.native
object ucs2 extends TopLevel[ucs2]
