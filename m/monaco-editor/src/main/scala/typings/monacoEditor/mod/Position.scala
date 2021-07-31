package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "Position")
@js.native
class Position protected () extends StObject {
  def this(lineNumber: Double, column: Double) = this()
  
  /**
    * column (the first character in a line is between column 1 and column 2)
    */
  val column: Double = js.native
  
  /**
    * Derive a new position from this position.
    *
    * @param deltaLineNumber line number delta
    * @param deltaColumn column delta
    */
  def delta(): Position = js.native
  def delta(deltaLineNumber: Double): Position = js.native
  def delta(deltaLineNumber: Double, deltaColumn: Double): Position = js.native
  def delta(deltaLineNumber: Unit, deltaColumn: Double): Position = js.native
  
  /**
    * Test if this position equals other position
    */
  def equals(other: IPosition): Boolean = js.native
  
  /**
    * Test if this position is before other position.
    * If the two positions are equal, the result will be false.
    */
  def isBefore(other: IPosition): Boolean = js.native
  
  /**
    * Test if this position is before other position.
    * If the two positions are equal, the result will be true.
    */
  def isBeforeOrEqual(other: IPosition): Boolean = js.native
  
  /**
    * line number (starts at 1)
    */
  val lineNumber: Double = js.native
  
  /**
    * Create a new position from this position.
    *
    * @param newLineNumber new line number
    * @param newColumn new column
    */
  def `with`(): Position = js.native
  def `with`(newLineNumber: Double): Position = js.native
  def `with`(newLineNumber: Double, newColumn: Double): Position = js.native
  def `with`(newLineNumber: Unit, newColumn: Double): Position = js.native
}
/* static members */
object Position {
  
  @JSImport("monaco-editor", "Position")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A function that compares positions, useful for sorting
    */
  @scala.inline
  def compare(a: IPosition, b: IPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Test if position `a` equals position `b`
    */
  @scala.inline
  def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals(a: Null, b: IPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals(a: IPosition): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals(a: IPosition, b: IPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if position `a` is before position `b`.
    * If the two positions are equal, the result will be false.
    */
  @scala.inline
  def isBefore(a: IPosition, b: IPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if position `a` is before position `b`.
    * If the two positions are equal, the result will be true.
    */
  @scala.inline
  def isBeforeOrEqual(a: IPosition, b: IPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBeforeOrEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if `obj` is an `IPosition`.
    */
  @scala.inline
  def isIPosition(obj: js.Any): /* is monaco-editor.monaco-editor.IPosition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPosition")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is monaco-editor.monaco-editor.IPosition */ Boolean]
  
  /**
    * Create a `Position` from an `IPosition`.
    */
  @scala.inline
  def lift(pos: IPosition): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(pos.asInstanceOf[js.Any]).asInstanceOf[Position]
}
