package typings.meteorDburlesCollectionHelpers.anon

import typings.meteorDburlesCollectionHelpers.mod.Full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fetch[T] extends js.Object {
  
  var fetch: js.UndefOr[js.Array[String]] = js.native
  
  var insert: js.UndefOr[js.Function2[/* userId */ String, /* doc */ Full[T] with T, Boolean]] = js.native
  
  var remove: js.UndefOr[js.Function2[/* userId */ String, /* doc */ Full[T] with T, Boolean]] = js.native
  
  // ditto
  // tslint:disable-next-line ban-types
  var transform: js.UndefOr[js.Function | Null] = js.native
  
  var update: js.UndefOr[
    js.Function4[
      /* userId */ String, 
      /* doc */ Full[T] with T, 
      /* fieldNames */ js.Array[String], 
      /* modifier */ js.Any, 
      Boolean
    ]
  ] = js.native
}
object Fetch {
  
  @scala.inline
  def apply[T](): Fetch[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fetch[T]]
  }
  
  @scala.inline
  implicit class FetchOps[Self <: Fetch[_], T] (val x: Self with Fetch[T]) extends AnyVal {
    
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
    def setFetchVarargs(value: String*): Self = this.set("fetch", js.Array(value :_*))
    
    @scala.inline
    def setFetch(value: js.Array[String]): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setInsert(value: (/* userId */ String, /* doc */ Full[T] with T) => Boolean): Self = this.set("insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setRemove(value: (/* userId */ String, /* doc */ Full[T] with T) => Boolean): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Function): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTransformNull: Self = this.set("transform", null)
    
    @scala.inline
    def setUpdate(
      value: (/* userId */ String, /* doc */ Full[T] with T, /* fieldNames */ js.Array[String], /* modifier */ js.Any) => Boolean
    ): Self = this.set("update", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
