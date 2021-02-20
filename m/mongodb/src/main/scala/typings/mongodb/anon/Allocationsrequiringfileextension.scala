package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allocationsrequiringfileextension extends StObject {
  
  var `allocations requiring file extension`: Double = js.native
  
  var `blocks allocated`: Double = js.native
  
  var `blocks freed`: Double = js.native
  
  var `checkpoint size`: Double = js.native
  
  var `file allocation unit size`: Double = js.native
  
  var `file bytes available for reuse`: Double = js.native
  
  var `file magic number`: Double = js.native
  
  var `file major version number`: Double = js.native
  
  var `file size in bytes`: Double = js.native
  
  var `minor version number`: Double = js.native
}
object Allocationsrequiringfileextension {
  
  @scala.inline
  def apply(
    `allocations requiring file extension`: Double,
    `blocks allocated`: Double,
    `blocks freed`: Double,
    `checkpoint size`: Double,
    `file allocation unit size`: Double,
    `file bytes available for reuse`: Double,
    `file magic number`: Double,
    `file major version number`: Double,
    `file size in bytes`: Double,
    `minor version number`: Double
  ): Allocationsrequiringfileextension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allocations requiring file extension")((`allocations requiring file extension`).asInstanceOf[js.Any])
    __obj.updateDynamic("blocks allocated")((`blocks allocated`).asInstanceOf[js.Any])
    __obj.updateDynamic("blocks freed")((`blocks freed`).asInstanceOf[js.Any])
    __obj.updateDynamic("checkpoint size")((`checkpoint size`).asInstanceOf[js.Any])
    __obj.updateDynamic("file allocation unit size")((`file allocation unit size`).asInstanceOf[js.Any])
    __obj.updateDynamic("file bytes available for reuse")((`file bytes available for reuse`).asInstanceOf[js.Any])
    __obj.updateDynamic("file magic number")((`file magic number`).asInstanceOf[js.Any])
    __obj.updateDynamic("file major version number")((`file major version number`).asInstanceOf[js.Any])
    __obj.updateDynamic("file size in bytes")((`file size in bytes`).asInstanceOf[js.Any])
    __obj.updateDynamic("minor version number")((`minor version number`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Allocationsrequiringfileextension]
  }
  
  @scala.inline
  implicit class AllocationsrequiringfileextensionMutableBuilder[Self <: Allocationsrequiringfileextension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAllocations requiring file extension`(value: Double): Self = StObject.set(x, "allocations requiring file extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlocks allocated`(value: Double): Self = StObject.set(x, "blocks allocated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlocks freed`(value: Double): Self = StObject.set(x, "blocks freed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCheckpoint size`(value: Double): Self = StObject.set(x, "checkpoint size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFile allocation unit size`(value: Double): Self = StObject.set(x, "file allocation unit size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFile bytes available for reuse`(value: Double): Self = StObject.set(x, "file bytes available for reuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFile magic number`(value: Double): Self = StObject.set(x, "file magic number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFile major version number`(value: Double): Self = StObject.set(x, "file major version number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFile size in bytes`(value: Double): Self = StObject.set(x, "file size in bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMinor version number`(value: Double): Self = StObject.set(x, "minor version number", value.asInstanceOf[js.Any])
  }
}
