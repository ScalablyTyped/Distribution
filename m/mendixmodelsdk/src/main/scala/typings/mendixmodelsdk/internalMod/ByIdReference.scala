package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal", "ByIdReference")
@js.native
class ByIdReference[T /* <: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container] */] protected ()
  extends typings.mendixmodelsdk.byIdReferenceMod.ByIdReference[T] {
  /**
    * Constructs and returns a new reference instance, that is owned (by a property of) an abstract element.
    */
  def this(owner: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container]) = this()
}
