package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.HeaderDefinition because var conflicts: description, disabled, id, name. Inlined key, value, system */ @JSImport("postman-collection", "Header")
@js.native
open class Header protected () extends Property[HeaderDefinition] {
  def this(options: String) = this()
  def this(options: HeaderDefinition) = this()
  def this(options: String, name: String) = this()
  def this(options: HeaderDefinition, name: String) = this()
  
  var key: js.UndefOr[String] = js.native
  
  var system: js.UndefOr[Boolean] = js.native
  
  def update(options: HeaderDefinition): Unit = js.native
  
  var value: js.UndefOr[String] = js.native
}
/* static members */
object Header {
  
  @JSImport("postman-collection", "Header")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): Header = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Header]
  inline def create(value: String): Header = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[Header]
  inline def create(value: String, name: String): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Header]
  inline def create(value: Unit, name: String): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Header]
  inline def create(value: HeaderDefinition): Header = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[Header]
  inline def create(value: HeaderDefinition, name: String): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  inline def isHeader(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeader")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parse(headerString: String): js.Array[HeaderDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(headerString.asInstanceOf[js.Any]).asInstanceOf[js.Array[HeaderDefinition]]
  
  inline def parseSingle(header: String): HeaderDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSingle")(header.asInstanceOf[js.Any]).asInstanceOf[HeaderDefinition]
  
  inline def unparse(headers: js.Array[HeaderDefinition]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(headers.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unparse(headers: js.Array[HeaderDefinition], separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(headers.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def unparse(headers: HeaderList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(headers.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unparse(headers: HeaderList, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(headers.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unparseSingle(header: HeaderDefinition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparseSingle")(header.asInstanceOf[js.Any]).asInstanceOf[String]
}
