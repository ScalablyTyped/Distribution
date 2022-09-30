package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable1
import typings.meteor.meteorStrings.available
import typings.meteor.meteorStrings.linearizable
import typings.meteor.meteorStrings.majority
import typings.meteor.meteorStrings.snapshot
import typings.mongodb.anon.Level
import typings.mongodb.mod.ReadConcern
import typings.mongodb.mod.ReadConcernLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofReadConcern
  extends StObject
     with Instantiable1[/* level */ ReadConcernLevel, ReadConcern] {
  
  def AVAILABLE: available = js.native
  
  def LINEARIZABLE: linearizable = js.native
  
  def MAJORITY: majority = js.native
  
  def SNAPSHOT: snapshot = js.native
  
  /**
    * Construct a ReadConcern given an options object.
    *
    * @param options - The options object from which to extract the write concern.
    */
  def fromOptions(): js.UndefOr[ReadConcern] = js.native
  def fromOptions(options: Level): js.UndefOr[ReadConcern] = js.native
}
