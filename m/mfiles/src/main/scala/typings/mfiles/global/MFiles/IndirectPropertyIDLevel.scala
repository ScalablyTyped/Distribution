package typings.mfiles.global.MFiles

import typings.mfiles.IIndirectPropertyIDLevel
import typings.mfiles.MFiles.MFIndirectPropertyIDLevelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.IndirectPropertyIDLevel")
@js.native
open class IndirectPropertyIDLevel ()
  extends StObject
     with IIndirectPropertyIDLevel {
  
  /* CompleteClass */
  override def Clone(): IIndirectPropertyIDLevel = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var LevelType: MFIndirectPropertyIDLevelType = js.native
  
  /* CompleteClass */
  override def ToJSON(): String = js.native
}
