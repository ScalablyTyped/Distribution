package typings.officeUiFabricReact.withResponsiveModeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponsiveMode extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "ResponsiveMode")
@js.native
object ResponsiveMode extends js.Object {
  @js.native
  sealed trait large extends ResponsiveMode
  
  @js.native
  sealed trait medium extends ResponsiveMode
  
  @js.native
  sealed trait small extends ResponsiveMode
  
  @js.native
  sealed trait unknown extends ResponsiveMode
  
  @js.native
  sealed trait xLarge extends ResponsiveMode
  
  @js.native
  sealed trait xxLarge extends ResponsiveMode
  
  @js.native
  sealed trait xxxLarge extends ResponsiveMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponsiveMode with Double] = js.native
  /* 2 */ @js.native
  object large extends TopLevel[large with Double]
  
  /* 1 */ @js.native
  object medium extends TopLevel[medium with Double]
  
  /* 0 */ @js.native
  object small extends TopLevel[small with Double]
  
  /* 999 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 3 */ @js.native
  object xLarge extends TopLevel[xLarge with Double]
  
  /* 4 */ @js.native
  object xxLarge extends TopLevel[xxLarge with Double]
  
  /* 5 */ @js.native
  object xxxLarge extends TopLevel[xxxLarge with Double]
  
}

