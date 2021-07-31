package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: scala.Double): js.UndefOr[ODataType & scala.Double] = js.native
  
  @js.native
  sealed trait Any
    extends StObject
       with ODataType
  /* 23 */ val Any: typings.orientjs.mod.ODataType.Any & scala.Double = js.native
  
  @js.native
  sealed trait Binary
    extends StObject
       with ODataType
  /* 8 */ val Binary: typings.orientjs.mod.ODataType.Binary & scala.Double = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with ODataType
  /* 0 */ val Boolean: typings.orientjs.mod.ODataType.Boolean & scala.Double = js.native
  
  @js.native
  sealed trait Byte
    extends StObject
       with ODataType
  /* 17 */ val Byte: typings.orientjs.mod.ODataType.Byte & scala.Double = js.native
  
  @js.native
  sealed trait Custom
    extends StObject
       with ODataType
  /* 20 */ val Custom: typings.orientjs.mod.ODataType.Custom & scala.Double = js.native
  
  @js.native
  sealed trait Date
    extends StObject
       with ODataType
  /* 19 */ val Date: typings.orientjs.mod.ODataType.Date & scala.Double = js.native
  
  @js.native
  sealed trait Datetime
    extends StObject
       with ODataType
  /* 6 */ val Datetime: typings.orientjs.mod.ODataType.Datetime & scala.Double = js.native
  
  @js.native
  sealed trait Decimal
    extends StObject
       with ODataType
  /* 21 */ val Decimal: typings.orientjs.mod.ODataType.Decimal & scala.Double = js.native
  
  @js.native
  sealed trait Double
    extends StObject
       with ODataType
  /* 5 */ val Double: typings.orientjs.mod.ODataType.Double & scala.Double = js.native
  
  @js.native
  sealed trait Embedded
    extends StObject
       with ODataType
  /* 9 */ val Embedded: typings.orientjs.mod.ODataType.Embedded & scala.Double = js.native
  
  @js.native
  sealed trait EmbeddedList
    extends StObject
       with ODataType
  /* 10 */ val EmbeddedList: typings.orientjs.mod.ODataType.EmbeddedList & scala.Double = js.native
  
  @js.native
  sealed trait EmbeddedMap
    extends StObject
       with ODataType
  /* 12 */ val EmbeddedMap: typings.orientjs.mod.ODataType.EmbeddedMap & scala.Double = js.native
  
  @js.native
  sealed trait EmbeddedSet
    extends StObject
       with ODataType
  /* 11 */ val EmbeddedSet: typings.orientjs.mod.ODataType.EmbeddedSet & scala.Double = js.native
  
  @js.native
  sealed trait Float
    extends StObject
       with ODataType
  /* 4 */ val Float: typings.orientjs.mod.ODataType.Float & scala.Double = js.native
  
  @js.native
  sealed trait Integer
    extends StObject
       with ODataType
  /* 1 */ val Integer: typings.orientjs.mod.ODataType.Integer & scala.Double = js.native
  
  @js.native
  sealed trait Link
    extends StObject
       with ODataType
  /* 13 */ val Link: typings.orientjs.mod.ODataType.Link & scala.Double = js.native
  
  @js.native
  sealed trait LinkBag
    extends StObject
       with ODataType
  /* 22 */ val LinkBag: typings.orientjs.mod.ODataType.LinkBag & scala.Double = js.native
  
  @js.native
  sealed trait LinkList
    extends StObject
       with ODataType
  /* 14 */ val LinkList: typings.orientjs.mod.ODataType.LinkList & scala.Double = js.native
  
  @js.native
  sealed trait LinkMap
    extends StObject
       with ODataType
  /* 16 */ val LinkMap: typings.orientjs.mod.ODataType.LinkMap & scala.Double = js.native
  
  @js.native
  sealed trait LinkSet
    extends StObject
       with ODataType
  /* 15 */ val LinkSet: typings.orientjs.mod.ODataType.LinkSet & scala.Double = js.native
  
  @js.native
  sealed trait Long
    extends StObject
       with ODataType
  /* 3 */ val Long: typings.orientjs.mod.ODataType.Long & scala.Double = js.native
  
  @js.native
  sealed trait Short
    extends StObject
       with ODataType
  /* 2 */ val Short: typings.orientjs.mod.ODataType.Short & scala.Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with ODataType
  /* 7 */ val String: typings.orientjs.mod.ODataType.String & scala.Double = js.native
  
  @js.native
  sealed trait Transient
    extends StObject
       with ODataType
  /* 18 */ val Transient: typings.orientjs.mod.ODataType.Transient & scala.Double = js.native
}
