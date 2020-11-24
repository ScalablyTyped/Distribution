package typings.parseColumns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[ValuesType /* <: js.Any */] extends js.Object {
  
  /**
  		Headers to use instead of the existing ones.
  		*/
  val headers: js.UndefOr[js.Array[String]] = js.native
  
  /**
  		Separator to split columns on.
  		@default ' '
  		*/
  val separator: js.UndefOr[String] = js.native
  
  /**
  		Transform elements.
  		Useful for being able to cleanup or change the type of elements.
  		*/
  val transform: js.UndefOr[
    js.Function4[
      /* element */ String, 
      /* header */ String, 
      /* columnIndex */ Double, 
      /* rowIndex */ Double, 
      ValuesType
    ]
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply[ValuesType /* <: js.Any */](): Options[ValuesType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ValuesType]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], ValuesType /* <: js.Any */] (val x: Self with Options[ValuesType]) extends AnyVal {
    
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
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setTransform(
      value: (/* element */ String, /* header */ String, /* columnIndex */ Double, /* rowIndex */ Double) => ValuesType
    ): Self = this.set("transform", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
