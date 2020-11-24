package typings.oracleOraclejet.ojvalidationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Converter[V] extends js.Object {
  
  def format(value: V): String | Null = js.native
  
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.native
  
  var getOptions: js.UndefOr[js.Function0[js.Object]] = js.native
  
  def parse(value: String): V | Null = js.native
  
  var resolvedOptions: js.UndefOr[js.Function0[js.Object]] = js.native
}
object Converter {
  
  @scala.inline
  def apply[V](format: V => String | Null, parse: String => V | Null): Converter[V] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Converter[V]]
  }
  
  @scala.inline
  implicit class ConverterOps[Self <: Converter[_], V] (val x: Self with Converter[V]) extends AnyVal {
    
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
    def setFormat(value: V => String | Null): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: String => V | Null): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHint(value: () => String | Null): Self = this.set("getHint", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHint: Self = this.set("getHint", js.undefined)
    
    @scala.inline
    def setGetOptions(value: () => js.Object): Self = this.set("getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOptions: Self = this.set("getOptions", js.undefined)
    
    @scala.inline
    def setResolvedOptions(value: () => js.Object): Self = this.set("resolvedOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResolvedOptions: Self = this.set("resolvedOptions", js.undefined)
  }
}
