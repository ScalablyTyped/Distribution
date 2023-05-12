package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelDecorationsChangedEvent extends StObject {
  
  val affectsGlyphMargin: Boolean
  
  val affectsMinimap: Boolean
  
  val affectsOverviewRuler: Boolean
}
object IModelDecorationsChangedEvent {
  
  inline def apply(affectsGlyphMargin: Boolean, affectsMinimap: Boolean, affectsOverviewRuler: Boolean): IModelDecorationsChangedEvent = {
    val __obj = js.Dynamic.literal(affectsGlyphMargin = affectsGlyphMargin.asInstanceOf[js.Any], affectsMinimap = affectsMinimap.asInstanceOf[js.Any], affectsOverviewRuler = affectsOverviewRuler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationsChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IModelDecorationsChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setAffectsGlyphMargin(value: Boolean): Self = StObject.set(x, "affectsGlyphMargin", value.asInstanceOf[js.Any])
    
    inline def setAffectsMinimap(value: Boolean): Self = StObject.set(x, "affectsMinimap", value.asInstanceOf[js.Any])
    
    inline def setAffectsOverviewRuler(value: Boolean): Self = StObject.set(x, "affectsOverviewRuler", value.asInstanceOf[js.Any])
  }
}
