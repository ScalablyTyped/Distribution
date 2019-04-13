package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataTypes extends js.Object

@JSImport("orientjs", "DataTypes")
@js.native
object DataTypes extends js.Object {
  @js.native
  sealed trait Binary
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Boolean
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Byte
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Custom
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Date
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Datetime
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Decimal
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Double
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Embedded
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait EmbeddedList
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait EmbeddedMap
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait EmbeddedSet
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Float
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Integer
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Link
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait LinkBag
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait LinkList
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait LinkMap
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait LinkSet
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Long
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Short
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait Transient
    extends orientjsLib.orientjsMod.DataTypes
  
  @js.native
  sealed trait string
    extends orientjsLib.orientjsMod.DataTypes
  
  /* 8 */ val Binary: Binary with scala.Double = js.native
  /* 0 */ val Boolean: Boolean with scala.Double = js.native
  /* 17 */ val Byte: Byte with scala.Double = js.native
  /* 20 */ val Custom: Custom with scala.Double = js.native
  /* 19 */ val Date: Date with scala.Double = js.native
  /* 6 */ val Datetime: Datetime with scala.Double = js.native
  /* 21 */ val Decimal: Decimal with scala.Double = js.native
  /* 5 */ val Double: Double with scala.Double = js.native
  /* 9 */ val Embedded: Embedded with scala.Double = js.native
  /* 10 */ val EmbeddedList: EmbeddedList with scala.Double = js.native
  /* 12 */ val EmbeddedMap: EmbeddedMap with scala.Double = js.native
  /* 11 */ val EmbeddedSet: EmbeddedSet with scala.Double = js.native
  /* 4 */ val Float: Float with scala.Double = js.native
  /* 1 */ val Integer: Integer with scala.Double = js.native
  /* 13 */ val Link: Link with scala.Double = js.native
  /* 22 */ val LinkBag: LinkBag with scala.Double = js.native
  /* 14 */ val LinkList: LinkList with scala.Double = js.native
  /* 16 */ val LinkMap: LinkMap with scala.Double = js.native
  /* 15 */ val LinkSet: LinkSet with scala.Double = js.native
  /* 3 */ val Long: Long with scala.Double = js.native
  /* 2 */ val Short: Short with scala.Double = js.native
  /* 18 */ val Transient: Transient with scala.Double = js.native
  /* 7 */ val string: string with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[orientjsLib.orientjsMod.DataTypes with scala.Double] = js.native
}

