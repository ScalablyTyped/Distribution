package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maintainercanmodify extends StObject {
  
  /** @description The name of the branch you want your changes pulled into. This should be an existing branch on the current repository. You cannot update the base branch on a pull request to point to another repository. */
  var base: js.UndefOr[String] = js.undefined
  
  /** @description The contents of the pull request. */
  var body: js.UndefOr[String] = js.undefined
  
  /** @description Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request. */
  var maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description State of this Pull Request. Either `open` or `closed`.
    * @enum {string}
    */
  var state: js.UndefOr[open | closed] = js.undefined
  
  /** @description The title of the pull request. */
  var title: js.UndefOr[String] = js.undefined
}
object Maintainercanmodify {
  
  inline def apply(): Maintainercanmodify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maintainercanmodify]
  }
  
  extension [Self <: Maintainercanmodify](x: Self) {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMaintainer_can_modify(value: Boolean): Self = StObject.set(x, "maintainer_can_modify", value.asInstanceOf[js.Any])
    
    inline def setMaintainer_can_modifyUndefined: Self = StObject.set(x, "maintainer_can_modify", js.undefined)
    
    inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
