package typings.orientjs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ODataType extends js.Object
/**
  * A list of orientdb data types, indexed by their type id.
  */
@JSImport("orientjs", "ODataType")
@js.native
object ODataType extends js.Object {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ODataType with scala.Double] = js.native
  
  @js.native
  sealed trait Any extends ODataType
  /* 23 */ @js.native
  object Any
    extends TopLevel[Any with scala.Double]
  
  @js.native
  sealed trait Binary extends ODataType
  /* 8 */ @js.native
  object Binary
    extends TopLevel[Binary with scala.Double]
  
  @js.native
  sealed trait Boolean extends ODataType
  /* 0 */ @js.native
  object Boolean
    extends TopLevel[Boolean with scala.Double]
  
  @js.native
  sealed trait Byte extends ODataType
  /* 17 */ @js.native
  object Byte
    extends TopLevel[Byte with scala.Double]
  
  @js.native
  sealed trait Custom extends ODataType
  /* 20 */ @js.native
  object Custom
    extends TopLevel[Custom with scala.Double]
  
  @js.native
  sealed trait Date extends ODataType
  /* 19 */ @js.native
  object Date
    extends TopLevel[Date with scala.Double]
  
  @js.native
  sealed trait Datetime extends ODataType
  /* 6 */ @js.native
  object Datetime
    extends TopLevel[Datetime with scala.Double]
  
  @js.native
  sealed trait Decimal extends ODataType
  /* 21 */ @js.native
  object Decimal
    extends TopLevel[Decimal with scala.Double]
  
  @js.native
  sealed trait Double extends ODataType
  /* 5 */ @js.native
  object Double
    extends TopLevel[Double with scala.Double]
  
  @js.native
  sealed trait Embedded extends ODataType
  /* 9 */ @js.native
  object Embedded
    extends TopLevel[Embedded with scala.Double]
  
  @js.native
  sealed trait EmbeddedList extends ODataType
  /* 10 */ @js.native
  object EmbeddedList
    extends TopLevel[EmbeddedList with scala.Double]
  
  @js.native
  sealed trait EmbeddedMap extends ODataType
  /* 12 */ @js.native
  object EmbeddedMap
    extends TopLevel[EmbeddedMap with scala.Double]
  
  @js.native
  sealed trait EmbeddedSet extends ODataType
  /* 11 */ @js.native
  object EmbeddedSet
    extends TopLevel[EmbeddedSet with scala.Double]
  
  @js.native
  sealed trait Float extends ODataType
  /* 4 */ @js.native
  object Float
    extends TopLevel[Float with scala.Double]
  
  @js.native
  sealed trait Integer extends ODataType
  /* 1 */ @js.native
  object Integer
    extends TopLevel[Integer with scala.Double]
  
  @js.native
  sealed trait Link extends ODataType
  /* 13 */ @js.native
  object Link
    extends TopLevel[Link with scala.Double]
  
  @js.native
  sealed trait LinkBag extends ODataType
  /* 22 */ @js.native
  object LinkBag
    extends TopLevel[LinkBag with scala.Double]
  
  @js.native
  sealed trait LinkList extends ODataType
  /* 14 */ @js.native
  object LinkList
    extends TopLevel[LinkList with scala.Double]
  
  @js.native
  sealed trait LinkMap extends ODataType
  /* 16 */ @js.native
  object LinkMap
    extends TopLevel[LinkMap with scala.Double]
  
  @js.native
  sealed trait LinkSet extends ODataType
  /* 15 */ @js.native
  object LinkSet
    extends TopLevel[LinkSet with scala.Double]
  
  @js.native
  sealed trait Long extends ODataType
  /* 3 */ @js.native
  object Long
    extends TopLevel[Long with scala.Double]
  
  @js.native
  sealed trait Short extends ODataType
  /* 2 */ @js.native
  object Short
    extends TopLevel[Short with scala.Double]
  
  @js.native
  sealed trait String extends ODataType
  /* 7 */ @js.native
  object String
    extends TopLevel[String with scala.Double]
  
  @js.native
  sealed trait Transient extends ODataType
  /* 18 */ @js.native
  object Transient
    extends TopLevel[Transient with scala.Double]
}
