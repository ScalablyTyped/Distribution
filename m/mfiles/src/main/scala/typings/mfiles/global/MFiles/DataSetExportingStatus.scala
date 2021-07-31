package typings.mfiles.global.MFiles

import typings.mfiles.IDataSetExportingStatus
import typings.mfiles.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.DataSetExportingStatus")
@js.native
class DataSetExportingStatus ()
  extends StObject
     with IDataSetExportingStatus {
  
  /* CompleteClass */
  override val CurrentServerTime: ITimestamp = js.native
  
  /* CompleteClass */
  override val IsExporting: Boolean = js.native
  
  /* CompleteClass */
  override val LatestActivity: ITimestamp = js.native
}
