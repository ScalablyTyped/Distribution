package typings.pixiCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Geometry")
@js.native
/**
  * @param buffers - An array of buffers. optional.
  * @param attributes - Of the geometry, optional structure of the attributes layout
  */
open class Geometry ()
  extends typings.pixiCore.libGeometryGeometryMod.Geometry {
  def this(buffers: js.Array[typings.pixiCore.libGeometryBufferMod.Buffer]) = this()
  def this(
    buffers: js.Array[typings.pixiCore.libGeometryBufferMod.Buffer],
    attributes: StringDictionary[typings.pixiCore.libGeometryAttributeMod.Attribute]
  ) = this()
  def this(buffers: Unit, attributes: StringDictionary[typings.pixiCore.libGeometryAttributeMod.Attribute]) = this()
}
/* static members */
object Geometry {
  
  @JSImport("@pixi/core", "Geometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Merges an array of geometries into a new single one.
    *
    * Geometry attribute styles must match for this operation to work.
    * @param geometries - array of geometries to merge
    * @returns - Shiny new geometry!
    */
  inline def merge(geometries: js.Array[typings.pixiCore.libGeometryGeometryMod.Geometry]): typings.pixiCore.libGeometryGeometryMod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometries.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.libGeometryGeometryMod.Geometry]
}
