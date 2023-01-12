package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StringDictionary
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.ghost
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.outline
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.solid
import typings.react.mod.ForwardedRef
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx[Shape]
  extends StObject
     with /* x */ StringDictionary[String | Boolean | ForwardedRef[Any] | Shape] {
  
  var active: Boolean
  
  def onClick(event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit
  
  var ref: ForwardedRef[Any]
  
  var shape: Shape
  
  var value: String
  
  var variant: outline | solid | ghost
}
object Dictx {
  
  inline def apply[Shape](
    active: Boolean,
    onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    shape: Shape,
    value: String,
    variant: outline | solid | ghost
  ): Dictx[Shape] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), shape = shape.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[Dictx[Shape]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dictx[?], Shape] (val x: Self & Dictx[Shape]) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setRef(value: ForwardedRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: outline | solid | ghost): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
