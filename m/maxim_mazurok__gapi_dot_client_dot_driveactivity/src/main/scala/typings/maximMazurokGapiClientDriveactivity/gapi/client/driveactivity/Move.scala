package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Move extends StObject {
  
  /** The added parent object(s). */
  var addedParents: js.UndefOr[js.Array[TargetReference]] = js.undefined
  
  /** The removed parent object(s). */
  var removedParents: js.UndefOr[js.Array[TargetReference]] = js.undefined
}
object Move {
  
  @scala.inline
  def apply(): Move = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Move]
  }
  
  @scala.inline
  implicit class MoveMutableBuilder[Self <: Move] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedParents(value: js.Array[TargetReference]): Self = StObject.set(x, "addedParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedParentsUndefined: Self = StObject.set(x, "addedParents", js.undefined)
    
    @scala.inline
    def setAddedParentsVarargs(value: TargetReference*): Self = StObject.set(x, "addedParents", js.Array(value :_*))
    
    @scala.inline
    def setRemovedParents(value: js.Array[TargetReference]): Self = StObject.set(x, "removedParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedParentsUndefined: Self = StObject.set(x, "removedParents", js.undefined)
    
    @scala.inline
    def setRemovedParentsVarargs(value: TargetReference*): Self = StObject.set(x, "removedParents", js.Array(value :_*))
  }
}
