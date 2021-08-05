package typings.ot.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "TextOperation")
@js.native
class TextOperation () extends StObject {
  
  /**
    * Apply an operation to a string, returning a new string. Throws an error if
    * there's a mismatch between the input string and the operation.
    * @param doc The doc
    */
  @JSName("apply")
  def apply(doc: String): String = js.native
  
  /**
    * An operation's baseLength is the length of every string the operation
    * can be applied to.
    */
  var baseLength: Double = js.native
  
  /**
    * Compose merges two consecutive operations into one operation, that
    * preserves the changes of both. Or, in other words, for each input string S
    * and a pair of consecutive operations A and B,
    * apply(apply(S, A), B) = apply(S, compose(A, B)) must hold.
    * @param operation The op
    */
  def compose(operation: TextOperation): TextOperation = js.native
  
  def delete(str: String): TextOperation = js.native
  /**
    * Delete a string at the current position.
    * @param str The string or its length
    */
  def delete(str: Double): TextOperation = js.native
  
  def equals(other: TextOperation): Boolean = js.native
  
  /**
    * Insert a string at the current position.
    * @param str The string
    */
  def insert(str: String): TextOperation = js.native
  
  /**
    * Computes the inverse of an operation. The inverse of an operation is the
    * operation that reverts the effects of the operation, e.g. when you have an
    * operation 'insert("hello "); skip(6);' then the inverse is 'delete("hello ");
    * skip(6);'. The inverse should be used for implementing undo.
    * @param doc The doc
    */
  def invert(doc: String): TextOperation = js.native
  
  /**
    * Tests whether this operation has no effect.
    */
  def isNoop(): Boolean = js.native
  
  /**
    * When an operation is applied to an input string, you can think of this as
    * if an imaginary cursor runs over the entire string and skips over some
    * parts, deletes some parts and inserts characters at some positions. These
    * actions (skip/delete/insert) are stored as an array in the "ops" property.
    */
  var ops: SerializedTextOperation = js.native
  
  /**
    * Skip over a given number of characters.
    * @param length The length
    */
  def retain(length: Double): TextOperation = js.native
  
  /**
    * When you use ctrl-z to undo your latest changes, you expect the program not
    * to undo every single keystroke but to undo your last sentence you wrote at
    * a stretch or the deletion you did by holding the backspace key down. This
    * This can be implemented by composing operations on the undo stack. This
    * method can help decide whether two operations should be composed. It
    * returns true if the operations are consecutive insert operations or both
    * operations delete text at the same position. You may want to include other
    * factors like the time since the last change in your decision.
    * @param operation The op
    */
  def shouldBeComposedWith(operation: TextOperation): Boolean = js.native
  
  /**
    * Decides whether two operations should be composed with each other
    * if they were inverted, that is
    * `shouldBeComposedWith(a, b) = shouldBeComposedWithInverted(b^{-1}, a^{-1})`.
    * @param operation The op
    */
  def shouldBeComposedWithInverted(operation: TextOperation): Boolean = js.native
  
  /**
    * The targetLength is the length of every string that results from applying
    * the operation on a valid input string.
    */
  var targetLength: Double = js.native
  
  /**
    * Converts operation into a JSON value.
    */
  def toJSON(): SerializedTextOperation = js.native
}
/* static members */
object TextOperation {
  
  @JSImport("ot", "TextOperation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a plain JS object into an operation and validates it.
    * @param operation The op
    */
  inline def fromJSON(operation: SerializedTextOperation): TextOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(operation.asInstanceOf[js.Any]).asInstanceOf[TextOperation]
  
  /**
    * Delete ops: Delete the next n characters. Represented by negative ints.
    * @param operation The op
    */
  inline def isDelete(operation: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDelete")(operation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDelete(operation: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDelete")(operation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Insert ops: Insert a given string at the current cursor position.
    *   Represented by strings.
    * @param operation The op
    */
  inline def isInsert(operation: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInsert")(operation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isInsert(operation: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInsert")(operation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Retain ops: Advance the cursor position by a given number of characters.
    *   Represented by positive ints.
    * @param operation The op
    */
  inline def isRetain(operation: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRetain")(operation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isRetain(operation: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRetain")(operation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Transform takes two operations A and B that happened concurrently and
    * produces two operations A' and B' (in an array) such that
    * `apply(apply(S, A), B') = apply(apply(S, B), A')`. This function is the
    * heart of OT.
    * @param left The left op
    * @param right The right op
    */
  inline def transform(left: TextOperation, right: TextOperation): TextOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[TextOperation]
}
