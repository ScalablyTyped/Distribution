package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffNavigatorOptions extends StObject {
  
  val alwaysRevealFirst: js.UndefOr[Boolean] = js.undefined
  
  val followsCaret: js.UndefOr[Boolean] = js.undefined
  
  val ignoreCharChanges: js.UndefOr[Boolean] = js.undefined
}
object IDiffNavigatorOptions {
  
  @scala.inline
  def apply(): IDiffNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffNavigatorOptions]
  }
  
  @scala.inline
  implicit class IDiffNavigatorOptionsMutableBuilder[Self <: IDiffNavigatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysRevealFirst(value: Boolean): Self = StObject.set(x, "alwaysRevealFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysRevealFirstUndefined: Self = StObject.set(x, "alwaysRevealFirst", js.undefined)
    
    @scala.inline
    def setFollowsCaret(value: Boolean): Self = StObject.set(x, "followsCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowsCaretUndefined: Self = StObject.set(x, "followsCaret", js.undefined)
    
    @scala.inline
    def setIgnoreCharChanges(value: Boolean): Self = StObject.set(x, "ignoreCharChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCharChangesUndefined: Self = StObject.set(x, "ignoreCharChanges", js.undefined)
  }
}
