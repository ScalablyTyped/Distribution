package typings.pkijs.mod

import typings.std.BufferSource
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs", "ExtensionValueFactory")
@js.native
open class ExtensionValueFactory () extends StObject
object ExtensionValueFactory {
  
  @JSImport("pkijs", "ExtensionValueFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def find(id: String): ExtensionValueType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(id.asInstanceOf[js.Any]).asInstanceOf[ExtensionValueType | Null]
  
  /* static member */
  inline def fromBER(id: String, raw: BufferSource): ExtensionParsedValue | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBER")(id.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[ExtensionParsedValue | Null]
  
  /* static member */
  @JSImport("pkijs", "ExtensionValueFactory.getItems")
  @js.native
  def getItems: Any = js.native
  inline def getItems_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItems")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def register(id: String, name: String, `type`: ExtensionValueConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("pkijs", "ExtensionValueFactory.types")
  @js.native
  def types: js.UndefOr[Record[String, ExtensionValueType]] = js.native
  inline def types_=(x: js.UndefOr[Record[String, ExtensionValueType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
}
