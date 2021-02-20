package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ODataType extends StObject
/**
  * A list of orientdb data types, indexed by their type id.
  */
@JSImport("orientjs", "ODataType")
@js.native
object ODataType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ODataType with scala.Double] = js.native
  
  @js.native
  sealed trait Any extends ODataType
  /* 23 */ val Any: typings.orientjs.mod.ODataType.Any with scala.Double = js.native
  
  @js.native
  sealed trait Binary extends ODataType
  /* 8 */ val Binary: typings.orientjs.mod.ODataType.Binary with scala.Double = js.native
  
  @js.native
  sealed trait Boolean extends ODataType
  /* 0 */ val Boolean: typings.orientjs.mod.ODataType.Boolean with scala.Double = js.native
  
  @js.native
  sealed trait Byte extends ODataType
  /* 17 */ val Byte: typings.orientjs.mod.ODataType.Byte with scala.Double = js.native
  
  @js.native
  sealed trait Custom extends ODataType
  /* 20 */ val Custom: typings.orientjs.mod.ODataType.Custom with scala.Double = js.native
  
  @js.native
  sealed trait Date extends ODataType
  /* 19 */ val Date: typings.orientjs.mod.ODataType.Date with scala.Double = js.native
  
  @js.native
  sealed trait Datetime extends ODataType
  /* 6 */ val Datetime: typings.orientjs.mod.ODataType.Datetime with scala.Double = js.native
  
  @js.native
  sealed trait Decimal extends ODataType
  /* 21 */ val Decimal: typings.orientjs.mod.ODataType.Decimal with scala.Double = js.native
  
  @js.native
  sealed trait Double extends ODataType
  /* 5 */ val Double: typings.orientjs.mod.ODataType.Double with scala.Double = js.native
  
  @js.native
  sealed trait Embedded extends ODataType
  /* 9 */ val Embedded: typings.orientjs.mod.ODataType.Embedded with scala.Double = js.native
  
  @js.native
  sealed trait EmbeddedList extends ODataType
  /* 10 */ val EmbeddedList: typings.orientjs.mod.ODataType.EmbeddedList with scala.Double = js.native
  
  @js.native
  sealed trait EmbeddedMap extends ODataType
  /* 12 */ val EmbeddedMap: typings.orientjs.mod.ODataType.EmbeddedMap with scala.Double = js.native
  
  @js.native
  sealed trait EmbeddedSet extends ODataType
  /* 11 */ val EmbeddedSet: typings.orientjs.mod.ODataType.EmbeddedSet with scala.Double = js.native
  
  @js.native
  sealed trait Float extends ODataType
  /* 4 */ val Float: typings.orientjs.mod.ODataType.Float with scala.Double = js.native
  
  @js.native
  sealed trait Integer extends ODataType
  /* 1 */ val Integer: typings.orientjs.mod.ODataType.Integer with scala.Double = js.native
  
  @js.native
  sealed trait Link extends ODataType
  /* 13 */ val Link: typings.orientjs.mod.ODataType.Link with scala.Double = js.native
  
  @js.native
  sealed trait LinkBag extends ODataType
  /* 22 */ val LinkBag: typings.orientjs.mod.ODataType.LinkBag with scala.Double = js.native
  
  @js.native
  sealed trait LinkList extends ODataType
  /* 14 */ val LinkList: typings.orientjs.mod.ODataType.LinkList with scala.Double = js.native
  
  @js.native
  sealed trait LinkMap extends ODataType
  /* 16 */ val LinkMap: typings.orientjs.mod.ODataType.LinkMap with scala.Double = js.native
  
  @js.native
  sealed trait LinkSet extends ODataType
  /* 15 */ val LinkSet: typings.orientjs.mod.ODataType.LinkSet with scala.Double = js.native
  
  @js.native
  sealed trait Long extends ODataType
  /* 3 */ val Long: typings.orientjs.mod.ODataType.Long with scala.Double = js.native
  
  @js.native
  sealed trait Short extends ODataType
  /* 2 */ val Short: typings.orientjs.mod.ODataType.Short with scala.Double = js.native
  
  @js.native
  sealed trait String extends ODataType
  /* 7 */ val String: typings.orientjs.mod.ODataType.String with scala.Double = js.native
  
  @js.native
  sealed trait Transient extends ODataType
  /* 18 */ val Transient: typings.orientjs.mod.ODataType.Transient with scala.Double = js.native
}
