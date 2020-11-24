package typings.naverWhale.whale.devtools.network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HARFormatEntry * / any */ @js.native
trait Request extends js.Object {
  
  /**
    * Returns content of the response body.
    * @param callback A function that receives the response body when the request completes.
    * The callback parameter should be a function that looks like this:
    * function(string content, string encoding) {...};
    * Parameter content: Content of the response body (potentially encoded).
    * Parameter encoding: Empty if content is not encoded, encoding name otherwise. Currently, only base64 is supported.
    */
  def getContent(callback: js.Function2[/* content */ String, /* encoding */ String, Unit]): Unit = js.native
}
object Request {
  
  @scala.inline
  def apply(getContent: js.Function2[/* content */ String, /* encoding */ String, Unit] => Unit): Request = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction1(getContent))
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setGetContent(value: js.Function2[/* content */ String, /* encoding */ String, Unit] => Unit): Self = this.set("getContent", js.Any.fromFunction1(value))
  }
}
