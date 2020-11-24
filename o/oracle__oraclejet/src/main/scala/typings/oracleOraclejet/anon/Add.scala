package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add
  extends /* key */ StringDictionary[js.Any] {
  
  var add: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[
    js.Function3[/* collection */ this.type, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  
  var fetchSize: js.UndefOr[Double] = js.native
  
  var set: js.UndefOr[Boolean] = js.native
  
  var since: js.UndefOr[js.Any] = js.native
  
  var startID: js.UndefOr[js.Any] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var success: js.UndefOr[
    js.Function3[/* collection */ this.type, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  
  var until: js.UndefOr[js.Any] = js.native
}
object Add {
  
  @scala.inline
  def apply(): Add = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit class AddOps[Self <: Add] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Boolean): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setError(value: (Add, /* xhr */ js.Any, /* options */ js.Object) => Unit): Self = this.set("error", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFetchSize(value: Double): Self = this.set("fetchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchSize: Self = this.set("fetchSize", js.undefined)
    
    @scala.inline
    def setSet(value: Boolean): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setSince(value: js.Any): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    
    @scala.inline
    def setStartID(value: js.Any): Self = this.set("startID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartID: Self = this.set("startID", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setSuccess(value: (Add, /* response */ js.Any, /* options */ js.Object) => Unit): Self = this.set("success", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setUntil(value: js.Any): Self = this.set("until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUntil: Self = this.set("until", js.undefined)
  }
}
