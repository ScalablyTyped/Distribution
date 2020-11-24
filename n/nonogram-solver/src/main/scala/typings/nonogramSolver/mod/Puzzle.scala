package typings.nonogramSolver.mod

import typings.nonogramSolver.anon.RequiredInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nonogram-solver", "Puzzle")
@js.native
class Puzzle protected () extends js.Object {
  def this(data: String) = this()
  def this(data: Input) = this()
  
  var columnHints: js.Array[js.Array[Double]] = js.native
  
  var height: Double = js.native
  
  def `import`(puzzle: Puzzle): Unit = js.native
  
  val isFinished: Boolean = js.native
  
  val isSolved: Boolean = js.native
  
  var rowHints: js.Array[js.Array[Double]] = js.native
  
  var snapshot: js.Array[Double] = js.native
  
  val svg: String = js.native
  
  def toJSON(): RequiredInput = js.native
  
  var width: Double = js.native
}
