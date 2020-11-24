package typings.memoryFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsBlockDevice extends js.Object {
  
  def isBlockDevice(): Boolean = js.native
  
  def isCharacterDevice(): Boolean = js.native
  
  def isDirectory(): Boolean = js.native
  
  def isFIFO(): Boolean = js.native
  
  def isFile(): Boolean = js.native
  
  def isSocket(): Boolean = js.native
  
  def isSymbolicLink(): Boolean = js.native
}
object IsBlockDevice {
  
  @scala.inline
  def apply(
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean
  ): IsBlockDevice = {
    val __obj = js.Dynamic.literal(isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink))
    __obj.asInstanceOf[IsBlockDevice]
  }
  
  @scala.inline
  implicit class IsBlockDeviceOps[Self <: IsBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsBlockDevice(value: () => Boolean): Self = this.set("isBlockDevice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCharacterDevice(value: () => Boolean): Self = this.set("isCharacterDevice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = this.set("isDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFIFO(value: () => Boolean): Self = this.set("isFIFO", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFile(value: () => Boolean): Self = this.set("isFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSocket(value: () => Boolean): Self = this.set("isSocket", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSymbolicLink(value: () => Boolean): Self = this.set("isSymbolicLink", js.Any.fromFunction0(value))
  }
}
