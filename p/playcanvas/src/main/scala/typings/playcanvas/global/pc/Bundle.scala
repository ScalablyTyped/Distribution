package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of a Bundle Asset, which contains an index that maps URLs to blob URLs.
  *
  * @ignore
  */
@JSGlobal("pc.Bundle")
@js.native
open class Bundle protected ()
  extends typings.playcanvas.mod.Bundle {
  /**
    * Create a new Bundle instance.
    *
    * @param {object[]} files - An array of objects that have a name field and contain a
    * getBlobUrl() function.
    */
  def this(files: js.Array[js.Object]) = this()
}
