package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ahead extends StObject {
  
  /**
    * @description The number of commits the local repository is ahead of the remote.
    * @example 0
    */
  var ahead: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The number of commits the local repository is behind the remote.
    * @example 0
    */
  var behind: js.UndefOr[Double] = js.undefined
  
  /** @description Whether the local repository has uncommitted changes. */
  var has_uncommitted_changes: js.UndefOr[Boolean] = js.undefined
  
  /** @description Whether the local repository has unpushed changes. */
  var has_unpushed_changes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The current branch (or SHA if in detached HEAD state) of the local repository.
    * @example main
    */
  var ref: js.UndefOr[String] = js.undefined
}
object Ahead {
  
  inline def apply(): Ahead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ahead]
  }
  
  extension [Self <: Ahead](x: Self) {
    
    inline def setAhead(value: Double): Self = StObject.set(x, "ahead", value.asInstanceOf[js.Any])
    
    inline def setAheadUndefined: Self = StObject.set(x, "ahead", js.undefined)
    
    inline def setBehind(value: Double): Self = StObject.set(x, "behind", value.asInstanceOf[js.Any])
    
    inline def setBehindUndefined: Self = StObject.set(x, "behind", js.undefined)
    
    inline def setHas_uncommitted_changes(value: Boolean): Self = StObject.set(x, "has_uncommitted_changes", value.asInstanceOf[js.Any])
    
    inline def setHas_uncommitted_changesUndefined: Self = StObject.set(x, "has_uncommitted_changes", js.undefined)
    
    inline def setHas_unpushed_changes(value: Boolean): Self = StObject.set(x, "has_unpushed_changes", value.asInstanceOf[js.Any])
    
    inline def setHas_unpushed_changesUndefined: Self = StObject.set(x, "has_unpushed_changes", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
