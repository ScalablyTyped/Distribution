package typings.mfiles.global.MFiles

import typings.mfiles.ITimeZoneInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.TimeZoneInformation")
@js.native
open class TimeZoneInformation ()
  extends StObject
     with ITimeZoneInformation {
  
  /* CompleteClass */
  override def LoadTimeZoneByName(TimeZoneName: String): Unit = js.native
  
  /* CompleteClass */
  override def LoadWithCurrentTimeZone(): Unit = js.native
  
  /* CompleteClass */
  override val StandardName: String = js.native
}
