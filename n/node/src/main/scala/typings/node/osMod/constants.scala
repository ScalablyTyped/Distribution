package typings.node.osMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "constants")
@js.native
object constants extends js.Object {
  val UV_UDP_REUSEADDR: Double = js.native
  @js.native
  object errno extends js.Object {
    val E2BIG: Double = js.native
    val EACCES: Double = js.native
    val EADDRINUSE: Double = js.native
    val EADDRNOTAVAIL: Double = js.native
    val EAFNOSUPPORT: Double = js.native
    val EAGAIN: Double = js.native
    val EALREADY: Double = js.native
    val EBADF: Double = js.native
    val EBADMSG: Double = js.native
    val EBUSY: Double = js.native
    val ECANCELED: Double = js.native
    val ECHILD: Double = js.native
    val ECONNABORTED: Double = js.native
    val ECONNREFUSED: Double = js.native
    val ECONNRESET: Double = js.native
    val EDEADLK: Double = js.native
    val EDESTADDRREQ: Double = js.native
    val EDOM: Double = js.native
    val EDQUOT: Double = js.native
    val EEXIST: Double = js.native
    val EFAULT: Double = js.native
    val EFBIG: Double = js.native
    val EHOSTUNREACH: Double = js.native
    val EIDRM: Double = js.native
    val EILSEQ: Double = js.native
    val EINPROGRESS: Double = js.native
    val EINTR: Double = js.native
    val EINVAL: Double = js.native
    val EIO: Double = js.native
    val EISCONN: Double = js.native
    val EISDIR: Double = js.native
    val ELOOP: Double = js.native
    val EMFILE: Double = js.native
    val EMLINK: Double = js.native
    val EMSGSIZE: Double = js.native
    val EMULTIHOP: Double = js.native
    val ENAMETOOLONG: Double = js.native
    val ENETDOWN: Double = js.native
    val ENETRESET: Double = js.native
    val ENETUNREACH: Double = js.native
    val ENFILE: Double = js.native
    val ENOBUFS: Double = js.native
    val ENODATA: Double = js.native
    val ENODEV: Double = js.native
    val ENOENT: Double = js.native
    val ENOEXEC: Double = js.native
    val ENOLCK: Double = js.native
    val ENOLINK: Double = js.native
    val ENOMEM: Double = js.native
    val ENOMSG: Double = js.native
    val ENOPROTOOPT: Double = js.native
    val ENOSPC: Double = js.native
    val ENOSR: Double = js.native
    val ENOSTR: Double = js.native
    val ENOSYS: Double = js.native
    val ENOTCONN: Double = js.native
    val ENOTDIR: Double = js.native
    val ENOTEMPTY: Double = js.native
    val ENOTSOCK: Double = js.native
    val ENOTSUP: Double = js.native
    val ENOTTY: Double = js.native
    val ENXIO: Double = js.native
    val EOPNOTSUPP: Double = js.native
    val EOVERFLOW: Double = js.native
    val EPERM: Double = js.native
    val EPIPE: Double = js.native
    val EPROTO: Double = js.native
    val EPROTONOSUPPORT: Double = js.native
    val EPROTOTYPE: Double = js.native
    val ERANGE: Double = js.native
    val EROFS: Double = js.native
    val ESPIPE: Double = js.native
    val ESRCH: Double = js.native
    val ESTALE: Double = js.native
    val ETIME: Double = js.native
    val ETIMEDOUT: Double = js.native
    val ETXTBSY: Double = js.native
    val EWOULDBLOCK: Double = js.native
    val EXDEV: Double = js.native
    val WSAEACCES: Double = js.native
    val WSAEADDRINUSE: Double = js.native
    val WSAEADDRNOTAVAIL: Double = js.native
    val WSAEAFNOSUPPORT: Double = js.native
    val WSAEALREADY: Double = js.native
    val WSAEBADF: Double = js.native
    val WSAECANCELLED: Double = js.native
    val WSAECONNABORTED: Double = js.native
    val WSAECONNREFUSED: Double = js.native
    val WSAECONNRESET: Double = js.native
    val WSAEDESTADDRREQ: Double = js.native
    val WSAEDISCON: Double = js.native
    val WSAEDQUOT: Double = js.native
    val WSAEFAULT: Double = js.native
    val WSAEHOSTDOWN: Double = js.native
    val WSAEHOSTUNREACH: Double = js.native
    val WSAEINPROGRESS: Double = js.native
    val WSAEINTR: Double = js.native
    val WSAEINVAL: Double = js.native
    val WSAEINVALIDPROCTABLE: Double = js.native
    val WSAEINVALIDPROVIDER: Double = js.native
    val WSAEISCONN: Double = js.native
    val WSAELOOP: Double = js.native
    val WSAEMFILE: Double = js.native
    val WSAEMSGSIZE: Double = js.native
    val WSAENAMETOOLONG: Double = js.native
    val WSAENETDOWN: Double = js.native
    val WSAENETRESET: Double = js.native
    val WSAENETUNREACH: Double = js.native
    val WSAENOBUFS: Double = js.native
    val WSAENOMORE: Double = js.native
    val WSAENOPROTOOPT: Double = js.native
    val WSAENOTCONN: Double = js.native
    val WSAENOTEMPTY: Double = js.native
    val WSAENOTSOCK: Double = js.native
    val WSAEOPNOTSUPP: Double = js.native
    val WSAEPFNOSUPPORT: Double = js.native
    val WSAEPROCLIM: Double = js.native
    val WSAEPROTONOSUPPORT: Double = js.native
    val WSAEPROTOTYPE: Double = js.native
    val WSAEPROVIDERFAILEDINIT: Double = js.native
    val WSAEREFUSED: Double = js.native
    val WSAEREMOTE: Double = js.native
    val WSAESHUTDOWN: Double = js.native
    val WSAESOCKTNOSUPPORT: Double = js.native
    val WSAESTALE: Double = js.native
    val WSAETIMEDOUT: Double = js.native
    val WSAETOOMANYREFS: Double = js.native
    val WSAEUSERS: Double = js.native
    val WSAEWOULDBLOCK: Double = js.native
    val WSANOTINITIALISED: Double = js.native
    val WSASERVICE_NOT_FOUND: Double = js.native
    val WSASYSCALLFAILURE: Double = js.native
    val WSASYSNOTREADY: Double = js.native
    val WSATYPE_NOT_FOUND: Double = js.native
    val WSAVERNOTSUPPORTED: Double = js.native
    val WSA_E_CANCELLED: Double = js.native
    val WSA_E_NO_MORE: Double = js.native
  }
  
  @js.native
  object priority extends js.Object {
    val PRIORITY_ABOVE_NORMAL: Double = js.native
    val PRIORITY_BELOW_NORMAL: Double = js.native
    val PRIORITY_HIGH: Double = js.native
    val PRIORITY_HIGHEST: Double = js.native
    val PRIORITY_LOW: Double = js.native
    val PRIORITY_NORMAL: Double = js.native
  }
  
  @js.native
  object signals extends TopLevel[SignalConstants]
  
}

