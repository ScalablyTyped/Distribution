package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss", "decl")
@js.native
object decl extends js.Object {
  /**
    * Creates a new Declaration node.
    * @param defaults Properties for the new Declaration node.
    * @returns The new node.
    */
  def apply(): Declaration = js.native
  def apply(defaults: DeclarationNewProps): Declaration = js.native
}

