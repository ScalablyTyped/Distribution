package typings.next

import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CrossOrigin extends js.Object {
  var crossOrigin: Requireable[String]
  var nonce: Requireable[String]
}

object Anon_CrossOrigin {
  @scala.inline
  def apply(crossOrigin: Requireable[String], nonce: Requireable[String]): Anon_CrossOrigin = {
    val __obj = js.Dynamic.literal(crossOrigin = crossOrigin, nonce = nonce)
  
    __obj.asInstanceOf[Anon_CrossOrigin]
  }
}

