package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationLink extends js.Object {
  
  /**
    * A range to select where this link originates from.
    */
  var originSelectionRange: js.UndefOr[IRange] = js.native
  
  /**
    * The full range this link points to.
    */
  var range: IRange = js.native
  
  /**
    * A range to select this link points to. Must be contained
    * in `LocationLink.range`.
    */
  var targetSelectionRange: js.UndefOr[IRange] = js.native
  
  /**
    * The target uri this link points to.
    */
  var uri: Uri = js.native
}
object LocationLink {
  
  @scala.inline
  def apply(range: IRange, uri: Uri): LocationLink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLink]
  }
  
  @scala.inline
  implicit class LocationLinkOps[Self <: LocationLink] (val x: Self) extends AnyVal {
    
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
    def setRange(value: IRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginSelectionRange(value: IRange): Self = this.set("originSelectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginSelectionRange: Self = this.set("originSelectionRange", js.undefined)
    
    @scala.inline
    def setTargetSelectionRange(value: IRange): Self = this.set("targetSelectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSelectionRange: Self = this.set("targetSelectionRange", js.undefined)
  }
}
