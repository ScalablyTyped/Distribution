package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Transferrable extends StObject
object _Transferrable {
  
  inline def Color(
    components: js.Array[Double],
    convert: ColorFormat => typings.novaEditorNode.Color,
    format: ColorFormat
  ): typings.novaEditorNode.Color = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], convert = js.Any.fromFunction1(convert), format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.novaEditorNode.Color]
  }
  
  inline def Range(
    compare: typings.novaEditorNode.Range => Double,
    containsIndex: Double => Boolean,
    containsRange: typings.novaEditorNode.Range => Boolean,
    empty: Boolean,
    end: Double,
    intersection: typings.novaEditorNode.Range => typings.novaEditorNode.Range,
    intersectsRange: typings.novaEditorNode.Range => Boolean,
    isEqual: typings.novaEditorNode.Range => Boolean,
    length: Double,
    start: Double,
    union: typings.novaEditorNode.Range => typings.novaEditorNode.Range
  ): typings.novaEditorNode.Range = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), containsIndex = js.Any.fromFunction1(containsIndex), containsRange = js.Any.fromFunction1(containsRange), empty = empty.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], intersection = js.Any.fromFunction1(intersection), intersectsRange = js.Any.fromFunction1(intersectsRange), isEqual = js.Any.fromFunction1(isEqual), length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], union = js.Any.fromFunction1(union))
    __obj.asInstanceOf[typings.novaEditorNode.Range]
  }
}
