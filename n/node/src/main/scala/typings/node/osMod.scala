package typings.node

import typings.node.NodeJS.Dict
import typings.node.anon.Idle
import typings.node.anon.`2`
import typings.node.anon.`4`
import typings.node.nodeStrings.BE
import typings.node.nodeStrings.IPv4
import typings.node.nodeStrings.IPv6
import typings.node.nodeStrings.LE
import typings.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osMod {
  
  @JSImport("os", "EOL")
  @js.native
  val EOL: java.lang.String = js.native
  
  @JSImport("os", "arch")
  @js.native
  def arch(): java.lang.String = js.native
  
  object constants {
    
    @JSImport("os", "constants.UV_UDP_REUSEADDR")
    @js.native
    val UV_UDP_REUSEADDR: Double = js.native
    
    object errno {
      
      @JSImport("os", "constants.errno.E2BIG")
      @js.native
      val E2BIG: Double = js.native
      
      @JSImport("os", "constants.errno.EACCES")
      @js.native
      val EACCES: Double = js.native
      
      @JSImport("os", "constants.errno.EADDRINUSE")
      @js.native
      val EADDRINUSE: Double = js.native
      
      @JSImport("os", "constants.errno.EADDRNOTAVAIL")
      @js.native
      val EADDRNOTAVAIL: Double = js.native
      
      @JSImport("os", "constants.errno.EAFNOSUPPORT")
      @js.native
      val EAFNOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.EAGAIN")
      @js.native
      val EAGAIN: Double = js.native
      
      @JSImport("os", "constants.errno.EALREADY")
      @js.native
      val EALREADY: Double = js.native
      
      @JSImport("os", "constants.errno.EBADF")
      @js.native
      val EBADF: Double = js.native
      
      @JSImport("os", "constants.errno.EBADMSG")
      @js.native
      val EBADMSG: Double = js.native
      
      @JSImport("os", "constants.errno.EBUSY")
      @js.native
      val EBUSY: Double = js.native
      
      @JSImport("os", "constants.errno.ECANCELED")
      @js.native
      val ECANCELED: Double = js.native
      
      @JSImport("os", "constants.errno.ECHILD")
      @js.native
      val ECHILD: Double = js.native
      
      @JSImport("os", "constants.errno.ECONNABORTED")
      @js.native
      val ECONNABORTED: Double = js.native
      
      @JSImport("os", "constants.errno.ECONNREFUSED")
      @js.native
      val ECONNREFUSED: Double = js.native
      
      @JSImport("os", "constants.errno.ECONNRESET")
      @js.native
      val ECONNRESET: Double = js.native
      
      @JSImport("os", "constants.errno.EDEADLK")
      @js.native
      val EDEADLK: Double = js.native
      
      @JSImport("os", "constants.errno.EDESTADDRREQ")
      @js.native
      val EDESTADDRREQ: Double = js.native
      
      @JSImport("os", "constants.errno.EDOM")
      @js.native
      val EDOM: Double = js.native
      
      @JSImport("os", "constants.errno.EDQUOT")
      @js.native
      val EDQUOT: Double = js.native
      
      @JSImport("os", "constants.errno.EEXIST")
      @js.native
      val EEXIST: Double = js.native
      
      @JSImport("os", "constants.errno.EFAULT")
      @js.native
      val EFAULT: Double = js.native
      
      @JSImport("os", "constants.errno.EFBIG")
      @js.native
      val EFBIG: Double = js.native
      
      @JSImport("os", "constants.errno.EHOSTUNREACH")
      @js.native
      val EHOSTUNREACH: Double = js.native
      
      @JSImport("os", "constants.errno.EIDRM")
      @js.native
      val EIDRM: Double = js.native
      
      @JSImport("os", "constants.errno.EILSEQ")
      @js.native
      val EILSEQ: Double = js.native
      
      @JSImport("os", "constants.errno.EINPROGRESS")
      @js.native
      val EINPROGRESS: Double = js.native
      
      @JSImport("os", "constants.errno.EINTR")
      @js.native
      val EINTR: Double = js.native
      
      @JSImport("os", "constants.errno.EINVAL")
      @js.native
      val EINVAL: Double = js.native
      
      @JSImport("os", "constants.errno.EIO")
      @js.native
      val EIO: Double = js.native
      
      @JSImport("os", "constants.errno.EISCONN")
      @js.native
      val EISCONN: Double = js.native
      
      @JSImport("os", "constants.errno.EISDIR")
      @js.native
      val EISDIR: Double = js.native
      
      @JSImport("os", "constants.errno.ELOOP")
      @js.native
      val ELOOP: Double = js.native
      
      @JSImport("os", "constants.errno.EMFILE")
      @js.native
      val EMFILE: Double = js.native
      
      @JSImport("os", "constants.errno.EMLINK")
      @js.native
      val EMLINK: Double = js.native
      
      @JSImport("os", "constants.errno.EMSGSIZE")
      @js.native
      val EMSGSIZE: Double = js.native
      
      @JSImport("os", "constants.errno.EMULTIHOP")
      @js.native
      val EMULTIHOP: Double = js.native
      
      @JSImport("os", "constants.errno.ENAMETOOLONG")
      @js.native
      val ENAMETOOLONG: Double = js.native
      
      @JSImport("os", "constants.errno.ENETDOWN")
      @js.native
      val ENETDOWN: Double = js.native
      
      @JSImport("os", "constants.errno.ENETRESET")
      @js.native
      val ENETRESET: Double = js.native
      
      @JSImport("os", "constants.errno.ENETUNREACH")
      @js.native
      val ENETUNREACH: Double = js.native
      
      @JSImport("os", "constants.errno.ENFILE")
      @js.native
      val ENFILE: Double = js.native
      
      @JSImport("os", "constants.errno.ENOBUFS")
      @js.native
      val ENOBUFS: Double = js.native
      
      @JSImport("os", "constants.errno.ENODATA")
      @js.native
      val ENODATA: Double = js.native
      
      @JSImport("os", "constants.errno.ENODEV")
      @js.native
      val ENODEV: Double = js.native
      
      @JSImport("os", "constants.errno.ENOENT")
      @js.native
      val ENOENT: Double = js.native
      
      @JSImport("os", "constants.errno.ENOEXEC")
      @js.native
      val ENOEXEC: Double = js.native
      
      @JSImport("os", "constants.errno.ENOLCK")
      @js.native
      val ENOLCK: Double = js.native
      
      @JSImport("os", "constants.errno.ENOLINK")
      @js.native
      val ENOLINK: Double = js.native
      
      @JSImport("os", "constants.errno.ENOMEM")
      @js.native
      val ENOMEM: Double = js.native
      
      @JSImport("os", "constants.errno.ENOMSG")
      @js.native
      val ENOMSG: Double = js.native
      
      @JSImport("os", "constants.errno.ENOPROTOOPT")
      @js.native
      val ENOPROTOOPT: Double = js.native
      
      @JSImport("os", "constants.errno.ENOSPC")
      @js.native
      val ENOSPC: Double = js.native
      
      @JSImport("os", "constants.errno.ENOSR")
      @js.native
      val ENOSR: Double = js.native
      
      @JSImport("os", "constants.errno.ENOSTR")
      @js.native
      val ENOSTR: Double = js.native
      
      @JSImport("os", "constants.errno.ENOSYS")
      @js.native
      val ENOSYS: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTCONN")
      @js.native
      val ENOTCONN: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTDIR")
      @js.native
      val ENOTDIR: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTEMPTY")
      @js.native
      val ENOTEMPTY: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTSOCK")
      @js.native
      val ENOTSOCK: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTSUP")
      @js.native
      val ENOTSUP: Double = js.native
      
      @JSImport("os", "constants.errno.ENOTTY")
      @js.native
      val ENOTTY: Double = js.native
      
      @JSImport("os", "constants.errno.ENXIO")
      @js.native
      val ENXIO: Double = js.native
      
      @JSImport("os", "constants.errno.EOPNOTSUPP")
      @js.native
      val EOPNOTSUPP: Double = js.native
      
      @JSImport("os", "constants.errno.EOVERFLOW")
      @js.native
      val EOVERFLOW: Double = js.native
      
      @JSImport("os", "constants.errno.EPERM")
      @js.native
      val EPERM: Double = js.native
      
      @JSImport("os", "constants.errno.EPIPE")
      @js.native
      val EPIPE: Double = js.native
      
      @JSImport("os", "constants.errno.EPROTO")
      @js.native
      val EPROTO: Double = js.native
      
      @JSImport("os", "constants.errno.EPROTONOSUPPORT")
      @js.native
      val EPROTONOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.EPROTOTYPE")
      @js.native
      val EPROTOTYPE: Double = js.native
      
      @JSImport("os", "constants.errno.ERANGE")
      @js.native
      val ERANGE: Double = js.native
      
      @JSImport("os", "constants.errno.EROFS")
      @js.native
      val EROFS: Double = js.native
      
      @JSImport("os", "constants.errno.ESPIPE")
      @js.native
      val ESPIPE: Double = js.native
      
      @JSImport("os", "constants.errno.ESRCH")
      @js.native
      val ESRCH: Double = js.native
      
      @JSImport("os", "constants.errno.ESTALE")
      @js.native
      val ESTALE: Double = js.native
      
      @JSImport("os", "constants.errno.ETIME")
      @js.native
      val ETIME: Double = js.native
      
      @JSImport("os", "constants.errno.ETIMEDOUT")
      @js.native
      val ETIMEDOUT: Double = js.native
      
      @JSImport("os", "constants.errno.ETXTBSY")
      @js.native
      val ETXTBSY: Double = js.native
      
      @JSImport("os", "constants.errno.EWOULDBLOCK")
      @js.native
      val EWOULDBLOCK: Double = js.native
      
      @JSImport("os", "constants.errno.EXDEV")
      @js.native
      val EXDEV: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEACCES")
      @js.native
      val WSAEACCES: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEADDRINUSE")
      @js.native
      val WSAEADDRINUSE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEADDRNOTAVAIL")
      @js.native
      val WSAEADDRNOTAVAIL: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEAFNOSUPPORT")
      @js.native
      val WSAEAFNOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEALREADY")
      @js.native
      val WSAEALREADY: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEBADF")
      @js.native
      val WSAEBADF: Double = js.native
      
      @JSImport("os", "constants.errno.WSAECANCELLED")
      @js.native
      val WSAECANCELLED: Double = js.native
      
      @JSImport("os", "constants.errno.WSAECONNABORTED")
      @js.native
      val WSAECONNABORTED: Double = js.native
      
      @JSImport("os", "constants.errno.WSAECONNREFUSED")
      @js.native
      val WSAECONNREFUSED: Double = js.native
      
      @JSImport("os", "constants.errno.WSAECONNRESET")
      @js.native
      val WSAECONNRESET: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEDESTADDRREQ")
      @js.native
      val WSAEDESTADDRREQ: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEDISCON")
      @js.native
      val WSAEDISCON: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEDQUOT")
      @js.native
      val WSAEDQUOT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEFAULT")
      @js.native
      val WSAEFAULT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEHOSTDOWN")
      @js.native
      val WSAEHOSTDOWN: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEHOSTUNREACH")
      @js.native
      val WSAEHOSTUNREACH: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEINPROGRESS")
      @js.native
      val WSAEINPROGRESS: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEINTR")
      @js.native
      val WSAEINTR: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEINVAL")
      @js.native
      val WSAEINVAL: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEINVALIDPROCTABLE")
      @js.native
      val WSAEINVALIDPROCTABLE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEINVALIDPROVIDER")
      @js.native
      val WSAEINVALIDPROVIDER: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEISCONN")
      @js.native
      val WSAEISCONN: Double = js.native
      
      @JSImport("os", "constants.errno.WSAELOOP")
      @js.native
      val WSAELOOP: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEMFILE")
      @js.native
      val WSAEMFILE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEMSGSIZE")
      @js.native
      val WSAEMSGSIZE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENAMETOOLONG")
      @js.native
      val WSAENAMETOOLONG: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENETDOWN")
      @js.native
      val WSAENETDOWN: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENETRESET")
      @js.native
      val WSAENETRESET: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENETUNREACH")
      @js.native
      val WSAENETUNREACH: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOBUFS")
      @js.native
      val WSAENOBUFS: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOMORE")
      @js.native
      val WSAENOMORE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOPROTOOPT")
      @js.native
      val WSAENOPROTOOPT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOTCONN")
      @js.native
      val WSAENOTCONN: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOTEMPTY")
      @js.native
      val WSAENOTEMPTY: Double = js.native
      
      @JSImport("os", "constants.errno.WSAENOTSOCK")
      @js.native
      val WSAENOTSOCK: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEOPNOTSUPP")
      @js.native
      val WSAEOPNOTSUPP: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEPFNOSUPPORT")
      @js.native
      val WSAEPFNOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEPROCLIM")
      @js.native
      val WSAEPROCLIM: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEPROTONOSUPPORT")
      @js.native
      val WSAEPROTONOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEPROTOTYPE")
      @js.native
      val WSAEPROTOTYPE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEPROVIDERFAILEDINIT")
      @js.native
      val WSAEPROVIDERFAILEDINIT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEREFUSED")
      @js.native
      val WSAEREFUSED: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEREMOTE")
      @js.native
      val WSAEREMOTE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAESHUTDOWN")
      @js.native
      val WSAESHUTDOWN: Double = js.native
      
      @JSImport("os", "constants.errno.WSAESOCKTNOSUPPORT")
      @js.native
      val WSAESOCKTNOSUPPORT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAESTALE")
      @js.native
      val WSAESTALE: Double = js.native
      
      @JSImport("os", "constants.errno.WSAETIMEDOUT")
      @js.native
      val WSAETIMEDOUT: Double = js.native
      
      @JSImport("os", "constants.errno.WSAETOOMANYREFS")
      @js.native
      val WSAETOOMANYREFS: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEUSERS")
      @js.native
      val WSAEUSERS: Double = js.native
      
      @JSImport("os", "constants.errno.WSAEWOULDBLOCK")
      @js.native
      val WSAEWOULDBLOCK: Double = js.native
      
      @JSImport("os", "constants.errno.WSANOTINITIALISED")
      @js.native
      val WSANOTINITIALISED: Double = js.native
      
      @JSImport("os", "constants.errno.WSASERVICE_NOT_FOUND")
      @js.native
      val WSASERVICE_NOT_FOUND: Double = js.native
      
      @JSImport("os", "constants.errno.WSASYSCALLFAILURE")
      @js.native
      val WSASYSCALLFAILURE: Double = js.native
      
      @JSImport("os", "constants.errno.WSASYSNOTREADY")
      @js.native
      val WSASYSNOTREADY: Double = js.native
      
      @JSImport("os", "constants.errno.WSATYPE_NOT_FOUND")
      @js.native
      val WSATYPE_NOT_FOUND: Double = js.native
      
      @JSImport("os", "constants.errno.WSAVERNOTSUPPORTED")
      @js.native
      val WSAVERNOTSUPPORTED: Double = js.native
      
      @JSImport("os", "constants.errno.WSA_E_CANCELLED")
      @js.native
      val WSA_E_CANCELLED: Double = js.native
      
      @JSImport("os", "constants.errno.WSA_E_NO_MORE")
      @js.native
      val WSA_E_NO_MORE: Double = js.native
    }
    
    object priority {
      
      @JSImport("os", "constants.priority.PRIORITY_ABOVE_NORMAL")
      @js.native
      val PRIORITY_ABOVE_NORMAL: Double = js.native
      
      @JSImport("os", "constants.priority.PRIORITY_BELOW_NORMAL")
      @js.native
      val PRIORITY_BELOW_NORMAL: Double = js.native
      
      @JSImport("os", "constants.priority.PRIORITY_HIGH")
      @js.native
      val PRIORITY_HIGH: Double = js.native
      
      @JSImport("os", "constants.priority.PRIORITY_HIGHEST")
      @js.native
      val PRIORITY_HIGHEST: Double = js.native
      
      @JSImport("os", "constants.priority.PRIORITY_LOW")
      @js.native
      val PRIORITY_LOW: Double = js.native
      
      @JSImport("os", "constants.priority.PRIORITY_NORMAL")
      @js.native
      val PRIORITY_NORMAL: Double = js.native
    }
    
    @JSImport("os", "constants.signals")
    @js.native
    val signals: SignalConstants = js.native
  }
  
  @JSImport("os", "cpus")
  @js.native
  def cpus(): js.Array[CpuInfo] = js.native
  
  @JSImport("os", "endianness")
  @js.native
  def endianness(): BE | LE = js.native
  
  @JSImport("os", "freemem")
  @js.native
  def freemem(): Double = js.native
  
  /**
    * Gets the priority of a process.
    * Defaults to current process.
    */
  @JSImport("os", "getPriority")
  @js.native
  def getPriority(): Double = js.native
  @JSImport("os", "getPriority")
  @js.native
  def getPriority(pid: Double): Double = js.native
  
  @JSImport("os", "homedir")
  @js.native
  def homedir(): java.lang.String = js.native
  
  @JSImport("os", "hostname")
  @js.native
  def hostname(): java.lang.String = js.native
  
  @JSImport("os", "loadavg")
  @js.native
  def loadavg(): js.Array[Double] = js.native
  
  @JSImport("os", "networkInterfaces")
  @js.native
  def networkInterfaces(): Dict[js.Array[NetworkInterfaceInfo]] = js.native
  
  @JSImport("os", "platform")
  @js.native
  def platform(): Platform = js.native
  
  @JSImport("os", "release")
  @js.native
  def release(): java.lang.String = js.native
  
  /**
    * Sets the priority of the process specified process.
    * @param priority Must be in range of -20 to 19
    */
  @JSImport("os", "setPriority")
  @js.native
  def setPriority(pid: Double, priority: Double): Unit = js.native
  /**
    * Sets the priority of the current process.
    * @param priority Must be in range of -20 to 19
    */
  @JSImport("os", "setPriority")
  @js.native
  def setPriority(priority: Double): Unit = js.native
  
  @JSImport("os", "tmpdir")
  @js.native
  def tmpdir(): java.lang.String = js.native
  
  @JSImport("os", "totalmem")
  @js.native
  def totalmem(): Double = js.native
  
  @JSImport("os", "uptime")
  @js.native
  def uptime(): Double = js.native
  
  @JSImport("os", "userInfo")
  @js.native
  def userInfo(): UserInfo_[java.lang.String] = js.native
  @JSImport("os", "userInfo")
  @js.native
  def userInfo(options: `2`): UserInfo_[Buffer] = js.native
  @JSImport("os", "userInfo")
  @js.native
  def userInfo(options: `4`): UserInfo_[java.lang.String] = js.native
  
  /**
    * Returns a string identifying the kernel version.
    * On POSIX systems, the operating system release is determined by calling
    * [uname(3)][]. On Windows, `pRtlGetVersion` is used, and if it is not available,
    * `GetVersionExW()` will be used. See
    * https://en.wikipedia.org/wiki/Uname#Examples for more information.
    */
  @JSImport("os", "version")
  @js.native
  def version(): java.lang.String = js.native
  
  @js.native
  trait CpuInfo extends StObject {
    
    var model: java.lang.String = js.native
    
    var speed: Double = js.native
    
    var times: Idle = js.native
  }
  object CpuInfo {
    
    @scala.inline
    def apply(model: java.lang.String, speed: Double, times: Idle): CpuInfo = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuInfo]
    }
    
    @scala.inline
    implicit class CpuInfoMutableBuilder[Self <: CpuInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: java.lang.String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimes(value: Idle): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NetworkInterfaceBase extends StObject {
    
    var address: java.lang.String = js.native
    
    var cidr: java.lang.String | Null = js.native
    
    var internal: Boolean = js.native
    
    var mac: java.lang.String = js.native
    
    var netmask: java.lang.String = js.native
  }
  object NetworkInterfaceBase {
    
    @scala.inline
    def apply(address: java.lang.String, internal: Boolean, mac: java.lang.String, netmask: java.lang.String): NetworkInterfaceBase = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInterfaceBase]
    }
    
    @scala.inline
    implicit class NetworkInterfaceBaseMutableBuilder[Self <: NetworkInterfaceBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidr(value: java.lang.String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrNull: Self = StObject.set(x, "cidr", null)
      
      @scala.inline
      def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: java.lang.String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetmask(value: java.lang.String): Self = StObject.set(x, "netmask", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.osMod.NetworkInterfaceInfoIPv4
    - typings.node.osMod.NetworkInterfaceInfoIPv6
  */
  trait NetworkInterfaceInfo extends StObject
  object NetworkInterfaceInfo {
    
    @scala.inline
    def NetworkInterfaceInfoIPv4(
      address: java.lang.String,
      family: IPv4,
      internal: Boolean,
      mac: java.lang.String,
      netmask: java.lang.String
    ): typings.node.osMod.NetworkInterfaceInfoIPv4 = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.osMod.NetworkInterfaceInfoIPv4]
    }
    
    @scala.inline
    def NetworkInterfaceInfoIPv6(
      address: java.lang.String,
      family: IPv6,
      internal: Boolean,
      mac: java.lang.String,
      netmask: java.lang.String,
      scopeid: Double
    ): typings.node.osMod.NetworkInterfaceInfoIPv6 = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], scopeid = scopeid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.node.osMod.NetworkInterfaceInfoIPv6]
    }
  }
  
  @js.native
  trait NetworkInterfaceInfoIPv4
    extends NetworkInterfaceBase
       with NetworkInterfaceInfo {
    
    var family: IPv4 = js.native
  }
  object NetworkInterfaceInfoIPv4 {
    
    @scala.inline
    def apply(
      address: java.lang.String,
      family: IPv4,
      internal: Boolean,
      mac: java.lang.String,
      netmask: java.lang.String
    ): NetworkInterfaceInfoIPv4 = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInterfaceInfoIPv4]
    }
    
    @scala.inline
    implicit class NetworkInterfaceInfoIPv4MutableBuilder[Self <: NetworkInterfaceInfoIPv4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: IPv4): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NetworkInterfaceInfoIPv6
    extends NetworkInterfaceBase
       with NetworkInterfaceInfo {
    
    var family: IPv6 = js.native
    
    var scopeid: Double = js.native
  }
  object NetworkInterfaceInfoIPv6 {
    
    @scala.inline
    def apply(
      address: java.lang.String,
      family: IPv6,
      internal: Boolean,
      mac: java.lang.String,
      netmask: java.lang.String,
      scopeid: Double
    ): NetworkInterfaceInfoIPv6 = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], scopeid = scopeid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInterfaceInfoIPv6]
    }
    
    @scala.inline
    implicit class NetworkInterfaceInfoIPv6MutableBuilder[Self <: NetworkInterfaceInfoIPv6] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: IPv6): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeid(value: Double): Self = StObject.set(x, "scopeid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in node.process.<global>.NodeJS.Signals ]: number} */
  @js.native
  trait SignalConstants extends StObject {
    
    var SIGABRT: Double = js.native
    
    var SIGALRM: Double = js.native
    
    var SIGBREAK: Double = js.native
    
    var SIGBUS: Double = js.native
    
    var SIGCHLD: Double = js.native
    
    var SIGCONT: Double = js.native
    
    var SIGFPE: Double = js.native
    
    var SIGHUP: Double = js.native
    
    var SIGILL: Double = js.native
    
    var SIGINFO: Double = js.native
    
    var SIGINT: Double = js.native
    
    var SIGIO: Double = js.native
    
    var SIGIOT: Double = js.native
    
    var SIGKILL: Double = js.native
    
    var SIGLOST: Double = js.native
    
    var SIGPIPE: Double = js.native
    
    var SIGPOLL: Double = js.native
    
    var SIGPROF: Double = js.native
    
    var SIGPWR: Double = js.native
    
    var SIGQUIT: Double = js.native
    
    var SIGSEGV: Double = js.native
    
    var SIGSTKFLT: Double = js.native
    
    var SIGSTOP: Double = js.native
    
    var SIGSYS: Double = js.native
    
    var SIGTERM: Double = js.native
    
    var SIGTRAP: Double = js.native
    
    var SIGTSTP: Double = js.native
    
    var SIGTTIN: Double = js.native
    
    var SIGTTOU: Double = js.native
    
    var SIGUNUSED: Double = js.native
    
    var SIGURG: Double = js.native
    
    var SIGUSR1: Double = js.native
    
    var SIGUSR2: Double = js.native
    
    var SIGVTALRM: Double = js.native
    
    var SIGWINCH: Double = js.native
    
    var SIGXCPU: Double = js.native
    
    var SIGXFSZ: Double = js.native
  }
  object SignalConstants {
    
    @scala.inline
    def apply(
      SIGABRT: Double,
      SIGALRM: Double,
      SIGBREAK: Double,
      SIGBUS: Double,
      SIGCHLD: Double,
      SIGCONT: Double,
      SIGFPE: Double,
      SIGHUP: Double,
      SIGILL: Double,
      SIGINFO: Double,
      SIGINT: Double,
      SIGIO: Double,
      SIGIOT: Double,
      SIGKILL: Double,
      SIGLOST: Double,
      SIGPIPE: Double,
      SIGPOLL: Double,
      SIGPROF: Double,
      SIGPWR: Double,
      SIGQUIT: Double,
      SIGSEGV: Double,
      SIGSTKFLT: Double,
      SIGSTOP: Double,
      SIGSYS: Double,
      SIGTERM: Double,
      SIGTRAP: Double,
      SIGTSTP: Double,
      SIGTTIN: Double,
      SIGTTOU: Double,
      SIGUNUSED: Double,
      SIGURG: Double,
      SIGUSR1: Double,
      SIGUSR2: Double,
      SIGVTALRM: Double,
      SIGWINCH: Double,
      SIGXCPU: Double,
      SIGXFSZ: Double
    ): SignalConstants = {
      val __obj = js.Dynamic.literal(SIGABRT = SIGABRT.asInstanceOf[js.Any], SIGALRM = SIGALRM.asInstanceOf[js.Any], SIGBREAK = SIGBREAK.asInstanceOf[js.Any], SIGBUS = SIGBUS.asInstanceOf[js.Any], SIGCHLD = SIGCHLD.asInstanceOf[js.Any], SIGCONT = SIGCONT.asInstanceOf[js.Any], SIGFPE = SIGFPE.asInstanceOf[js.Any], SIGHUP = SIGHUP.asInstanceOf[js.Any], SIGILL = SIGILL.asInstanceOf[js.Any], SIGINFO = SIGINFO.asInstanceOf[js.Any], SIGINT = SIGINT.asInstanceOf[js.Any], SIGIO = SIGIO.asInstanceOf[js.Any], SIGIOT = SIGIOT.asInstanceOf[js.Any], SIGKILL = SIGKILL.asInstanceOf[js.Any], SIGLOST = SIGLOST.asInstanceOf[js.Any], SIGPIPE = SIGPIPE.asInstanceOf[js.Any], SIGPOLL = SIGPOLL.asInstanceOf[js.Any], SIGPROF = SIGPROF.asInstanceOf[js.Any], SIGPWR = SIGPWR.asInstanceOf[js.Any], SIGQUIT = SIGQUIT.asInstanceOf[js.Any], SIGSEGV = SIGSEGV.asInstanceOf[js.Any], SIGSTKFLT = SIGSTKFLT.asInstanceOf[js.Any], SIGSTOP = SIGSTOP.asInstanceOf[js.Any], SIGSYS = SIGSYS.asInstanceOf[js.Any], SIGTERM = SIGTERM.asInstanceOf[js.Any], SIGTRAP = SIGTRAP.asInstanceOf[js.Any], SIGTSTP = SIGTSTP.asInstanceOf[js.Any], SIGTTIN = SIGTTIN.asInstanceOf[js.Any], SIGTTOU = SIGTTOU.asInstanceOf[js.Any], SIGUNUSED = SIGUNUSED.asInstanceOf[js.Any], SIGURG = SIGURG.asInstanceOf[js.Any], SIGUSR1 = SIGUSR1.asInstanceOf[js.Any], SIGUSR2 = SIGUSR2.asInstanceOf[js.Any], SIGVTALRM = SIGVTALRM.asInstanceOf[js.Any], SIGWINCH = SIGWINCH.asInstanceOf[js.Any], SIGXCPU = SIGXCPU.asInstanceOf[js.Any], SIGXFSZ = SIGXFSZ.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalConstants]
    }
    
    @scala.inline
    implicit class SignalConstantsMutableBuilder[Self <: SignalConstants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSIGABRT(value: Double): Self = StObject.set(x, "SIGABRT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGALRM(value: Double): Self = StObject.set(x, "SIGALRM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGBREAK(value: Double): Self = StObject.set(x, "SIGBREAK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGBUS(value: Double): Self = StObject.set(x, "SIGBUS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGCHLD(value: Double): Self = StObject.set(x, "SIGCHLD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGCONT(value: Double): Self = StObject.set(x, "SIGCONT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGFPE(value: Double): Self = StObject.set(x, "SIGFPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGHUP(value: Double): Self = StObject.set(x, "SIGHUP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGILL(value: Double): Self = StObject.set(x, "SIGILL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGINFO(value: Double): Self = StObject.set(x, "SIGINFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGINT(value: Double): Self = StObject.set(x, "SIGINT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGIO(value: Double): Self = StObject.set(x, "SIGIO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGIOT(value: Double): Self = StObject.set(x, "SIGIOT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGKILL(value: Double): Self = StObject.set(x, "SIGKILL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGLOST(value: Double): Self = StObject.set(x, "SIGLOST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGPIPE(value: Double): Self = StObject.set(x, "SIGPIPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGPOLL(value: Double): Self = StObject.set(x, "SIGPOLL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGPROF(value: Double): Self = StObject.set(x, "SIGPROF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGPWR(value: Double): Self = StObject.set(x, "SIGPWR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGQUIT(value: Double): Self = StObject.set(x, "SIGQUIT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGSEGV(value: Double): Self = StObject.set(x, "SIGSEGV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGSTKFLT(value: Double): Self = StObject.set(x, "SIGSTKFLT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGSTOP(value: Double): Self = StObject.set(x, "SIGSTOP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGSYS(value: Double): Self = StObject.set(x, "SIGSYS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTERM(value: Double): Self = StObject.set(x, "SIGTERM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTRAP(value: Double): Self = StObject.set(x, "SIGTRAP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTSTP(value: Double): Self = StObject.set(x, "SIGTSTP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTTIN(value: Double): Self = StObject.set(x, "SIGTTIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGTTOU(value: Double): Self = StObject.set(x, "SIGTTOU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGUNUSED(value: Double): Self = StObject.set(x, "SIGUNUSED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGURG(value: Double): Self = StObject.set(x, "SIGURG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGUSR1(value: Double): Self = StObject.set(x, "SIGUSR1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGUSR2(value: Double): Self = StObject.set(x, "SIGUSR2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGVTALRM(value: Double): Self = StObject.set(x, "SIGVTALRM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGWINCH(value: Double): Self = StObject.set(x, "SIGWINCH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGXCPU(value: Double): Self = StObject.set(x, "SIGXCPU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGXFSZ(value: Double): Self = StObject.set(x, "SIGXFSZ", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserInfo_[T] extends StObject {
    
    var gid: Double = js.native
    
    var homedir: T = js.native
    
    var shell: T = js.native
    
    var uid: Double = js.native
    
    var username: T = js.native
  }
  object UserInfo_ {
    
    @scala.inline
    def apply[T](gid: Double, homedir: T, shell: T, uid: Double, username: T): UserInfo_[T] = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], homedir = homedir.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo_[T]]
    }
    
    @scala.inline
    implicit class UserInfo_MutableBuilder[Self <: UserInfo_[_], T] (val x: Self with UserInfo_[T]) extends AnyVal {
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomedir(value: T): Self = StObject.set(x, "homedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: T): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: T): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("os", "type")
  @js.native
  def `type`(): java.lang.String = js.native
}
