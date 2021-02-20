package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Alignment extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.Alignment")
@js.native
object Alignment extends StObject {
  
  /**
    * Alignment to the center.
    *
    */
  @js.native
  sealed trait centered extends Alignment
  
  /**
    * Fully justified alignment.
    *
    */
  @js.native
  sealed trait justified extends Alignment
  
  /**
    * Alignment to the left.
    *
    */
  @js.native
  sealed trait left extends Alignment
  
  @js.native
  sealed trait mixed extends Alignment
  
  /**
    * Alignment to the right.
    *
    */
  @js.native
  sealed trait right extends Alignment
  
  /**
    * Unknown alignment.
    *
    */
  @js.native
  sealed trait unknown extends Alignment
}
