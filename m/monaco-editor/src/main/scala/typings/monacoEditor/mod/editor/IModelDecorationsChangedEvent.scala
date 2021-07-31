package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelDecorationsChangedEvent extends StObject {
  
  val affectsMinimap: Boolean
  
  val affectsOverviewRuler: Boolean
}
object IModelDecorationsChangedEvent {
  
  @scala.inline
  def apply(affectsMinimap: Boolean, affectsOverviewRuler: Boolean): IModelDecorationsChangedEvent = {
    val __obj = js.Dynamic.literal(affectsMinimap = affectsMinimap.asInstanceOf[js.Any], affectsOverviewRuler = affectsOverviewRuler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationsChangedEvent]
  }
  
  @scala.inline
  implicit class IModelDecorationsChangedEventMutableBuilder[Self <: IModelDecorationsChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffectsMinimap(value: Boolean): Self = StObject.set(x, "affectsMinimap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectsOverviewRuler(value: Boolean): Self = StObject.set(x, "affectsOverviewRuler", value.asInstanceOf[js.Any])
  }
}
