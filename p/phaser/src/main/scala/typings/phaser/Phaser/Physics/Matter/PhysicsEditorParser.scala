package typings.phaser.Phaser.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use PhysicsEditorParser.parseBody() to build a Matter body object, based on a physics data file
  * created and exported with PhysicsEditor (https://www.codeandweb.com/physicseditor).
  */
@JSGlobal("Phaser.Physics.Matter.PhysicsEditorParser")
@js.native
object PhysicsEditorParser extends js.Object {
  /**
    * Parses a body element exported by PhysicsEditor.
    * @param x x position.
    * @param y y position.
    * @param w width.
    * @param h height.
    * @param config body configuration and fixture (child body) definitions.
    */
  def parseBody(x: Double, y: Double, w: Double, h: Double, config: js.Object): js.Object = js.native
  /**
    * Parses an element of the "fixtures" list exported by PhysicsEditor
    * @param fixtureConfig the fixture object to parse
    */
  def parseFixture(fixtureConfig: js.Object): js.Array[js.Object] = js.native
  /**
    * Parses the "vertices" lists exported by PhysicsEditor.
    * @param vertexSets The vertex lists to parse.
    * @param options Matter body options.
    */
  def parseVertices(vertexSets: js.Object, options: js.Object): js.Array[js.Object] = js.native
}

