package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ReadConcern")
@js.native
open class ReadConcern protected ()
  extends StObject
     with ReadConcernLike {
  /** Constructs a ReadConcern from the read concern level.*/
  def this(level: ReadConcernLevel) = this()
  
  var level: ReadConcernLevel | String = js.native
  
  def toJSON(): Document = js.native
}
/* static members */
object ReadConcern {
  
  @JSImport("mongodb", "ReadConcern")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Construct a ReadConcern given an options object.
    *
    * @param options - The options object from which to extract the write concern.
    */
  inline def fromOptions(): js.UndefOr[ReadConcern] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")().asInstanceOf[js.UndefOr[ReadConcern]]
  inline def fromOptions(options: Level): js.UndefOr[ReadConcern] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReadConcern]]
}
