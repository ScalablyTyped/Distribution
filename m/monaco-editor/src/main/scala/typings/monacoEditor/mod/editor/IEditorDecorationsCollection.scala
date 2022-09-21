package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.IEvent
import typings.monacoEditor.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorDecorationsCollection extends StObject {
  
  /**
    * Remove all previous decorations.
    */
  def clear(): Unit
  
  /**
    * Get the range for a decoration.
    */
  def getRange(index: Double): Range | Null
  
  /**
    * Get all ranges for decorations.
    */
  def getRanges(): js.Array[Range]
  
  /**
    * Determine if a decoration is in this collection.
    */
  def has(decoration: IModelDecoration): Boolean
  
  /**
    * Get the decorations count.
    */
  var length: Double
  
  /**
    * An event emitted when decorations change in the editor,
    * but the change is not caused by us setting or clearing the collection.
    */
  def onDidChange(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, Any]): IDisposable
  def onDidChange(listener: js.Function1[/* e */ IModelDecorationsChangedEvent, Any], thisArg: Any): IDisposable
  /**
    * An event emitted when decorations change in the editor,
    * but the change is not caused by us setting or clearing the collection.
    */
  @JSName("onDidChange")
  var onDidChange_Original: IEvent[IModelDecorationsChangedEvent]
  
  /**
    * Replace all previous decorations with `newDecorations`.
    */
  def set(newDecorations: js.Array[IModelDeltaDecoration]): Unit
}
object IEditorDecorationsCollection {
  
  inline def apply(
    clear: () => Unit,
    getRange: Double => Range | Null,
    getRanges: () => js.Array[Range],
    has: IModelDecoration => Boolean,
    length: Double,
    onDidChange: (/* listener */ js.Function1[IModelDecorationsChangedEvent, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable,
    set: js.Array[IModelDeltaDecoration] => Unit
  ): IEditorDecorationsCollection = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getRange = js.Any.fromFunction1(getRange), getRanges = js.Any.fromFunction0(getRanges), has = js.Any.fromFunction1(has), length = length.asInstanceOf[js.Any], onDidChange = js.Any.fromFunction2(onDidChange), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IEditorDecorationsCollection]
  }
  
  extension [Self <: IEditorDecorationsCollection](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetRange(value: Double => Range | Null): Self = StObject.set(x, "getRange", js.Any.fromFunction1(value))
    
    inline def setGetRanges(value: () => js.Array[Range]): Self = StObject.set(x, "getRanges", js.Any.fromFunction0(value))
    
    inline def setHas(value: IModelDecoration => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOnDidChange(
      value: (/* listener */ js.Function1[IModelDecorationsChangedEvent, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable
    ): Self = StObject.set(x, "onDidChange", js.Any.fromFunction2(value))
    
    inline def setSet(value: js.Array[IModelDeltaDecoration] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
