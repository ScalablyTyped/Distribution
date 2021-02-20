package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.Fetch
import typings.std.Request
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var fetch: js.UndefOr[Fetch] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetch(
      value: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[typings.std.Response]
    ): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
  }
}
