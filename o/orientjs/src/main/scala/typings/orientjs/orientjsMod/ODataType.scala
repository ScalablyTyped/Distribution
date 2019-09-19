package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ODataType extends js.Object

/**
  * A list of orientdb data types, indexed by their type id.
  */
@JSImport("orientjs", "ODataType")
@js.native
object ODataType extends js.Object {
  @js.native
  sealed trait Any extends ODataType
  
  @js.native
  sealed trait Binary extends ODataType
  
  @js.native
  sealed trait Boolean extends ODataType
  
  @js.native
  sealed trait Byte extends ODataType
  
  @js.native
  sealed trait Custom extends ODataType
  
  @js.native
  sealed trait Date extends ODataType
  
  @js.native
  sealed trait Datetime extends ODataType
  
  @js.native
  sealed trait Decimal extends ODataType
  
  @js.native
  sealed trait Double extends ODataType
  
  @js.native
  sealed trait Embedded extends ODataType
  
  @js.native
  sealed trait EmbeddedList extends ODataType
  
  @js.native
  sealed trait EmbeddedMap extends ODataType
  
  @js.native
  sealed trait EmbeddedSet extends ODataType
  
  @js.native
  sealed trait Float extends ODataType
  
  @js.native
  sealed trait Integer extends ODataType
  
  @js.native
  sealed trait Link extends ODataType
  
  @js.native
  sealed trait LinkBag extends ODataType
  
  @js.native
  sealed trait LinkList extends ODataType
  
  @js.native
  sealed trait LinkMap extends ODataType
  
  @js.native
  sealed trait LinkSet extends ODataType
  
  @js.native
  sealed trait Long extends ODataType
  
  @js.native
  sealed trait Short extends ODataType
  
  @js.native
  sealed trait String extends ODataType
  
  @js.native
  sealed trait Transient extends ODataType
  
  /* 23 */ val Any: typings.orientjs.orientjsMod.ODataType.Any with scala.Double = js.native
  /* 8 */ val Binary: typings.orientjs.orientjsMod.ODataType.Binary with scala.Double = js.native
  /* 0 */ val Boolean: typings.orientjs.orientjsMod.ODataType.Boolean with scala.Double = js.native
  /* 17 */ val Byte: typings.orientjs.orientjsMod.ODataType.Byte with scala.Double = js.native
  /* 20 */ val Custom: typings.orientjs.orientjsMod.ODataType.Custom with scala.Double = js.native
  /* 19 */ val Date: typings.orientjs.orientjsMod.ODataType.Date with scala.Double = js.native
  /* 6 */ val Datetime: typings.orientjs.orientjsMod.ODataType.Datetime with scala.Double = js.native
  /* 21 */ val Decimal: typings.orientjs.orientjsMod.ODataType.Decimal with scala.Double = js.native
  /* 5 */ val Double: typings.orientjs.orientjsMod.ODataType.Double with scala.Double = js.native
  /* 9 */ val Embedded: typings.orientjs.orientjsMod.ODataType.Embedded with scala.Double = js.native
  /* 10 */ val EmbeddedList: typings.orientjs.orientjsMod.ODataType.EmbeddedList with scala.Double = js.native
  /* 12 */ val EmbeddedMap: typings.orientjs.orientjsMod.ODataType.EmbeddedMap with scala.Double = js.native
  /* 11 */ val EmbeddedSet: typings.orientjs.orientjsMod.ODataType.EmbeddedSet with scala.Double = js.native
  /* 4 */ val Float: typings.orientjs.orientjsMod.ODataType.Float with scala.Double = js.native
  /* 1 */ val Integer: typings.orientjs.orientjsMod.ODataType.Integer with scala.Double = js.native
  /* 13 */ val Link: typings.orientjs.orientjsMod.ODataType.Link with scala.Double = js.native
  /* 22 */ val LinkBag: typings.orientjs.orientjsMod.ODataType.LinkBag with scala.Double = js.native
  /* 14 */ val LinkList: typings.orientjs.orientjsMod.ODataType.LinkList with scala.Double = js.native
  /* 16 */ val LinkMap: typings.orientjs.orientjsMod.ODataType.LinkMap with scala.Double = js.native
  /* 15 */ val LinkSet: typings.orientjs.orientjsMod.ODataType.LinkSet with scala.Double = js.native
  /* 3 */ val Long: typings.orientjs.orientjsMod.ODataType.Long with scala.Double = js.native
  /* 2 */ val Short: typings.orientjs.orientjsMod.ODataType.Short with scala.Double = js.native
  /* 7 */ val String: typings.orientjs.orientjsMod.ODataType.String with scala.Double = js.native
  /* 18 */ val Transient: typings.orientjs.orientjsMod.ODataType.Transient with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ODataType with scala.Double] = js.native
}

