package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
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
    * @param x The horizontal world location of the body.
    * @param y The vertical world location of the body.
    * @param config The body configuration and fixture (child body) definitions, as exported by PhysicsEditor.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def parseBody(x: Double, y: Double, config: js.Object): BodyType = js.native
  def parseBody(x: Double, y: Double, config: js.Object, options: MatterBodyConfig): BodyType = js.native
  /**
    * Parses an element of the "fixtures" list exported by PhysicsEditor
    * @param fixtureConfig The fixture object to parse.
    */
  def parseFixture(fixtureConfig: js.Object): js.Array[BodyType] = js.native
  /**
    * Parses the "vertices" lists exported by PhysicsEditor.
    * @param vertexSets The vertex lists to parse.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def parseVertices(vertexSets: js.Array[_]): js.Array[BodyType] = js.native
  def parseVertices(vertexSets: js.Array[_], options: MatterBodyConfig): js.Array[BodyType] = js.native
}

