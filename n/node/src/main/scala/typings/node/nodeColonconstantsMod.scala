package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined { readonly E2BIG :number,  readonly EACCES :number,  readonly EADDRINUSE :number,  readonly EADDRNOTAVAIL :number,  readonly EAFNOSUPPORT :number,  readonly EAGAIN :number,  readonly EALREADY :number,  readonly EBADF :number,  readonly EBADMSG :number,  readonly EBUSY :number,  readonly ECANCELED :number,  readonly ECHILD :number,  readonly ECONNABORTED :number,  readonly ECONNREFUSED :number,  readonly ECONNRESET :number,  readonly EDEADLK :number,  readonly EDESTADDRREQ :number,  readonly EDOM :number,  readonly EDQUOT :number,  readonly EEXIST :number,  readonly EFAULT :number,  readonly EFBIG :number,  readonly EHOSTUNREACH :number,  readonly EIDRM :number,  readonly EILSEQ :number,  readonly EINPROGRESS :number,  readonly EINTR :number,  readonly EINVAL :number,  readonly EIO :number,  readonly EISCONN :number,  readonly EISDIR :number,  readonly ELOOP :number,  readonly EMFILE :number,  readonly EMLINK :number,  readonly EMSGSIZE :number,  readonly EMULTIHOP :number,  readonly ENAMETOOLONG :number,  readonly ENETDOWN :number,  readonly ENETRESET :number,  readonly ENETUNREACH :number,  readonly ENFILE :number,  readonly ENOBUFS :number,  readonly ENODATA :number,  readonly ENODEV :number,  readonly ENOENT :number,  readonly ENOEXEC :number,  readonly ENOLCK :number,  readonly ENOLINK :number,  readonly ENOMEM :number,  readonly ENOMSG :number,  readonly ENOPROTOOPT :number,  readonly ENOSPC :number,  readonly ENOSR :number,  readonly ENOSTR :number,  readonly ENOSYS :number,  readonly ENOTCONN :number,  readonly ENOTDIR :number,  readonly ENOTEMPTY :number,  readonly ENOTSOCK :number,  readonly ENOTSUP :number,  readonly ENOTTY :number,  readonly ENXIO :number,  readonly EOPNOTSUPP :number,  readonly EOVERFLOW :number,  readonly EPERM :number,  readonly EPIPE :number,  readonly EPROTO :number,  readonly EPROTONOSUPPORT :number,  readonly EPROTOTYPE :number,  readonly ERANGE :number,  readonly EROFS :number,  readonly ESPIPE :number,  readonly ESRCH :number,  readonly ESTALE :number,  readonly ETIME :number,  readonly ETIMEDOUT :number,  readonly ETXTBSY :number,  readonly EWOULDBLOCK :number,  readonly EXDEV :number,  readonly WSAEINTR :number,  readonly WSAEBADF :number,  readonly WSAEACCES :number,  readonly WSAEFAULT :number,  readonly WSAEINVAL :number,  readonly WSAEMFILE :number,  readonly WSAEWOULDBLOCK :number,  readonly WSAEINPROGRESS :number,  readonly WSAEALREADY :number,  readonly WSAENOTSOCK :number,  readonly WSAEDESTADDRREQ :number,  readonly WSAEMSGSIZE :number,  readonly WSAEPROTOTYPE :number,  readonly WSAENOPROTOOPT :number,  readonly WSAEPROTONOSUPPORT :number,  readonly WSAESOCKTNOSUPPORT :number,  readonly WSAEOPNOTSUPP :number,  readonly WSAEPFNOSUPPORT :number,  readonly WSAEAFNOSUPPORT :number,  readonly WSAEADDRINUSE :number,  readonly WSAEADDRNOTAVAIL :number,  readonly WSAENETDOWN :number,  readonly WSAENETUNREACH :number,  readonly WSAENETRESET :number,  readonly WSAECONNABORTED :number,  readonly WSAECONNRESET :number,  readonly WSAENOBUFS :number,  readonly WSAEISCONN :number,  readonly WSAENOTCONN :number,  readonly WSAESHUTDOWN :number,  readonly WSAETOOMANYREFS :number,  readonly WSAETIMEDOUT :number,  readonly WSAECONNREFUSED :number,  readonly WSAELOOP :number,  readonly WSAENAMETOOLONG :number,  readonly WSAEHOSTDOWN :number,  readonly WSAEHOSTUNREACH :number,  readonly WSAENOTEMPTY :number,  readonly WSAEPROCLIM :number,  readonly WSAEUSERS :number,  readonly WSAEDQUOT :number,  readonly WSAESTALE :number,  readonly WSAEREMOTE :number,  readonly WSASYSNOTREADY :number,  readonly WSAVERNOTSUPPORTED :number,  readonly WSANOTINITIALISED :number,  readonly WSAEDISCON :number,  readonly WSAENOMORE :number,  readonly WSAECANCELLED :number,  readonly WSAEINVALIDPROCTABLE :number,  readonly WSAEINVALIDPROVIDER :number,  readonly WSAEPROVIDERFAILEDINIT :number,  readonly WSASYSCALLFAILURE :number,  readonly WSASERVICE_NOT_FOUND :number,  readonly WSATYPE_NOT_FOUND :number,  readonly WSA_E_NO_MORE :number,  readonly WSA_E_CANCELLED :number,  readonly WSAEREFUSED :number} & { readonly PRIORITY_LOW :number,  readonly PRIORITY_BELOW_NORMAL :number,  readonly PRIORITY_NORMAL :number,  readonly PRIORITY_ABOVE_NORMAL :number,  readonly PRIORITY_HIGH :number,  readonly PRIORITY_HIGHEST :number} & node.node:os.SignalConstants & { readonly OPENSSL_VERSION_NUMBER :number,  readonly SSL_OP_ALL :number,  readonly SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION :number,  readonly SSL_OP_CIPHER_SERVER_PREFERENCE :number,  readonly SSL_OP_CISCO_ANYCONNECT :number,  readonly SSL_OP_COOKIE_EXCHANGE :number,  readonly SSL_OP_CRYPTOPRO_TLSEXT_BUG :number,  readonly SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS :number,  readonly SSL_OP_LEGACY_SERVER_CONNECT :number,  readonly SSL_OP_NO_COMPRESSION :number,  readonly SSL_OP_NO_QUERY_MTU :number,  readonly SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION :number,  readonly SSL_OP_NO_SSLv2 :number,  readonly SSL_OP_NO_SSLv3 :number,  readonly SSL_OP_NO_TICKET :number,  readonly SSL_OP_NO_TLSv1 :number,  readonly SSL_OP_NO_TLSv1_1 :number,  readonly SSL_OP_NO_TLSv1_2 :number,  readonly SSL_OP_TLS_ROLLBACK_BUG :number,  readonly ENGINE_METHOD_RSA :number,  readonly ENGINE_METHOD_DSA :number,  readonly ENGINE_METHOD_DH :number,  readonly ENGINE_METHOD_RAND :number,  readonly ENGINE_METHOD_EC :number,  readonly ENGINE_METHOD_CIPHERS :number,  readonly ENGINE_METHOD_DIGESTS :number,  readonly ENGINE_METHOD_PKEY_METHS :number,  readonly ENGINE_METHOD_PKEY_ASN1_METHS :number,  readonly ENGINE_METHOD_ALL :number,  readonly ENGINE_METHOD_NONE :number,  readonly DH_CHECK_P_NOT_SAFE_PRIME :number,  readonly DH_CHECK_P_NOT_PRIME :number,  readonly DH_UNABLE_TO_CHECK_GENERATOR :number,  readonly DH_NOT_SUITABLE_GENERATOR :number,  readonly RSA_PKCS1_PADDING :number,  readonly RSA_SSLV23_PADDING :number,  readonly RSA_NO_PADDING :number,  readonly RSA_PKCS1_OAEP_PADDING :number,  readonly RSA_X931_PADDING :number,  readonly RSA_PKCS1_PSS_PADDING :number,  readonly RSA_PSS_SALTLEN_DIGEST :number,  readonly RSA_PSS_SALTLEN_MAX_SIGN :number,  readonly RSA_PSS_SALTLEN_AUTO :number,  readonly POINT_CONVERSION_COMPRESSED :number,  readonly POINT_CONVERSION_UNCOMPRESSED :number,  readonly POINT_CONVERSION_HYBRID :number,  readonly defaultCoreCipherList :string,  readonly defaultCipherList :string} & { readonly F_OK :number,  readonly R_OK :number,  readonly W_OK :number,  readonly X_OK :number,  readonly COPYFILE_EXCL :number,  readonly COPYFILE_FICLONE :number,  readonly COPYFILE_FICLONE_FORCE :number,  readonly O_RDONLY :number,  readonly O_WRONLY :number,  readonly O_RDWR :number,  readonly O_CREAT :number,  readonly O_EXCL :number,  readonly O_NOCTTY :number,  readonly O_TRUNC :number,  readonly O_APPEND :number,  readonly O_DIRECTORY :number,  readonly O_NOATIME :number,  readonly O_NOFOLLOW :number,  readonly O_SYNC :number,  readonly O_DSYNC :number,  readonly O_SYMLINK :number,  readonly O_DIRECT :number,  readonly O_NONBLOCK :number,  readonly S_IFMT :number,  readonly S_IFREG :number,  readonly S_IFDIR :number,  readonly S_IFCHR :number,  readonly S_IFBLK :number,  readonly S_IFIFO :number,  readonly S_IFLNK :number,  readonly S_IFSOCK :number,  readonly S_IRWXU :number,  readonly S_IRUSR :number,  readonly S_IWUSR :number,  readonly S_IXUSR :number,  readonly S_IRWXG :number,  readonly S_IRGRP :number,  readonly S_IWGRP :number,  readonly S_IXGRP :number,  readonly S_IRWXO :number,  readonly S_IROTH :number,  readonly S_IWOTH :number,  readonly S_IXOTH :number,  readonly UV_FS_O_FILEMAP :number} */
object nodeColonconstantsMod {
  
  @JSImport("node:constants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // File Copy Constants
  /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
  @JSImport("node:constants", "COPYFILE_EXCL")
  @js.native
  val COPYFILE_EXCL: Double = js.native
  
  /**
    * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
    */
  @JSImport("node:constants", "COPYFILE_FICLONE")
  @js.native
  val COPYFILE_FICLONE: Double = js.native
  
  /**
    * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
    */
  @JSImport("node:constants", "COPYFILE_FICLONE_FORCE")
  @js.native
  val COPYFILE_FICLONE_FORCE: Double = js.native
  
  @JSImport("node:constants", "DH_CHECK_P_NOT_PRIME")
  @js.native
  val DH_CHECK_P_NOT_PRIME: Double = js.native
  
  @JSImport("node:constants", "DH_CHECK_P_NOT_SAFE_PRIME")
  @js.native
  val DH_CHECK_P_NOT_SAFE_PRIME: Double = js.native
  
  @JSImport("node:constants", "DH_NOT_SUITABLE_GENERATOR")
  @js.native
  val DH_NOT_SUITABLE_GENERATOR: Double = js.native
  
  @JSImport("node:constants", "DH_UNABLE_TO_CHECK_GENERATOR")
  @js.native
  val DH_UNABLE_TO_CHECK_GENERATOR: Double = js.native
  
  @JSImport("node:constants", "E2BIG")
  @js.native
  val E2BIG: Double = js.native
  
  @JSImport("node:constants", "EACCES")
  @js.native
  val EACCES: Double = js.native
  
  @JSImport("node:constants", "EADDRINUSE")
  @js.native
  val EADDRINUSE: Double = js.native
  
  @JSImport("node:constants", "EADDRNOTAVAIL")
  @js.native
  val EADDRNOTAVAIL: Double = js.native
  
  @JSImport("node:constants", "EAFNOSUPPORT")
  @js.native
  val EAFNOSUPPORT: Double = js.native
  
  @JSImport("node:constants", "EAGAIN")
  @js.native
  val EAGAIN: Double = js.native
  
  @JSImport("node:constants", "EALREADY")
  @js.native
  val EALREADY: Double = js.native
  
  @JSImport("node:constants", "EBADF")
  @js.native
  val EBADF: Double = js.native
  
  @JSImport("node:constants", "EBADMSG")
  @js.native
  val EBADMSG: Double = js.native
  
  @JSImport("node:constants", "EBUSY")
  @js.native
  val EBUSY: Double = js.native
  
  @JSImport("node:constants", "ECANCELED")
  @js.native
  val ECANCELED: Double = js.native
  
  @JSImport("node:constants", "ECHILD")
  @js.native
  val ECHILD: Double = js.native
  
  @JSImport("node:constants", "ECONNABORTED")
  @js.native
  val ECONNABORTED: Double = js.native
  
  @JSImport("node:constants", "ECONNREFUSED")
  @js.native
  val ECONNREFUSED: Double = js.native
  
  @JSImport("node:constants", "ECONNRESET")
  @js.native
  val ECONNRESET: Double = js.native
  
  @JSImport("node:constants", "EDEADLK")
  @js.native
  val EDEADLK: Double = js.native
  
  @JSImport("node:constants", "EDESTADDRREQ")
  @js.native
  val EDESTADDRREQ: Double = js.native
  
  @JSImport("node:constants", "EDOM")
  @js.native
  val EDOM: Double = js.native
  
  @JSImport("node:constants", "EDQUOT")
  @js.native
  val EDQUOT: Double = js.native
  
  @JSImport("node:constants", "EEXIST")
  @js.native
  val EEXIST: Double = js.native
  
  @JSImport("node:constants", "EFAULT")
  @js.native
  val EFAULT: Double = js.native
  
  @JSImport("node:constants", "EFBIG")
  @js.native
  val EFBIG: Double = js.native
  
  @JSImport("node:constants", "EHOSTUNREACH")
  @js.native
  val EHOSTUNREACH: Double = js.native
  
  @JSImport("node:constants", "EIDRM")
  @js.native
  val EIDRM: Double = js.native
  
  @JSImport("node:constants", "EILSEQ")
  @js.native
  val EILSEQ: Double = js.native
  
  @JSImport("node:constants", "EINPROGRESS")
  @js.native
  val EINPROGRESS: Double = js.native
  
  @JSImport("node:constants", "EINTR")
  @js.native
  val EINTR: Double = js.native
  
  @JSImport("node:constants", "EINVAL")
  @js.native
  val EINVAL: Double = js.native
  
  @JSImport("node:constants", "EIO")
  @js.native
  val EIO: Double = js.native
  
  @JSImport("node:constants", "EISCONN")
  @js.native
  val EISCONN: Double = js.native
  
  @JSImport("node:constants", "EISDIR")
  @js.native
  val EISDIR: Double = js.native
  
  @JSImport("node:constants", "ELOOP")
  @js.native
  val ELOOP: Double = js.native
  
  @JSImport("node:constants", "EMFILE")
  @js.native
  val EMFILE: Double = js.native
  
  @JSImport("node:constants", "EMLINK")
  @js.native
  val EMLINK: Double = js.native
  
  @JSImport("node:constants", "EMSGSIZE")
  @js.native
  val EMSGSIZE: Double = js.native
  
  @JSImport("node:constants", "EMULTIHOP")
  @js.native
  val EMULTIHOP: Double = js.native
  
  @JSImport("node:constants", "ENAMETOOLONG")
  @js.native
  val ENAMETOOLONG: Double = js.native
  
  @JSImport("node:constants", "ENETDOWN")
  @js.native
  val ENETDOWN: Double = js.native
  
  @JSImport("node:constants", "ENETRESET")
  @js.native
  val ENETRESET: Double = js.native
  
  @JSImport("node:constants", "ENETUNREACH")
  @js.native
  val ENETUNREACH: Double = js.native
  
  @JSImport("node:constants", "ENFILE")
  @js.native
  val ENFILE: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_ALL")
  @js.native
  val ENGINE_METHOD_ALL: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_CIPHERS")
  @js.native
  val ENGINE_METHOD_CIPHERS: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_DH")
  @js.native
  val ENGINE_METHOD_DH: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_DIGESTS")
  @js.native
  val ENGINE_METHOD_DIGESTS: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_DSA")
  @js.native
  val ENGINE_METHOD_DSA: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_EC")
  @js.native
  val ENGINE_METHOD_EC: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_NONE")
  @js.native
  val ENGINE_METHOD_NONE: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_PKEY_ASN1_METHS")
  @js.native
  val ENGINE_METHOD_PKEY_ASN1_METHS: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_PKEY_METHS")
  @js.native
  val ENGINE_METHOD_PKEY_METHS: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_RAND")
  @js.native
  val ENGINE_METHOD_RAND: Double = js.native
  
  @JSImport("node:constants", "ENGINE_METHOD_RSA")
  @js.native
  val ENGINE_METHOD_RSA: Double = js.native
  
  @JSImport("node:constants", "ENOBUFS")
  @js.native
  val ENOBUFS: Double = js.native
  
  @JSImport("node:constants", "ENODATA")
  @js.native
  val ENODATA: Double = js.native
  
  @JSImport("node:constants", "ENODEV")
  @js.native
  val ENODEV: Double = js.native
  
  @JSImport("node:constants", "ENOENT")
  @js.native
  val ENOENT: Double = js.native
  
  @JSImport("node:constants", "ENOEXEC")
  @js.native
  val ENOEXEC: Double = js.native
  
  @JSImport("node:constants", "ENOLCK")
  @js.native
  val ENOLCK: Double = js.native
  
  @JSImport("node:constants", "ENOLINK")
  @js.native
  val ENOLINK: Double = js.native
  
  @JSImport("node:constants", "ENOMEM")
  @js.native
  val ENOMEM: Double = js.native
  
  @JSImport("node:constants", "ENOMSG")
  @js.native
  val ENOMSG: Double = js.native
  
  @JSImport("node:constants", "ENOPROTOOPT")
  @js.native
  val ENOPROTOOPT: Double = js.native
  
  @JSImport("node:constants", "ENOSPC")
  @js.native
  val ENOSPC: Double = js.native
  
  @JSImport("node:constants", "ENOSR")
  @js.native
  val ENOSR: Double = js.native
  
  @JSImport("node:constants", "ENOSTR")
  @js.native
  val ENOSTR: Double = js.native
  
  @JSImport("node:constants", "ENOSYS")
  @js.native
  val ENOSYS: Double = js.native
  
  @JSImport("node:constants", "ENOTCONN")
  @js.native
  val ENOTCONN: Double = js.native
  
  @JSImport("node:constants", "ENOTDIR")
  @js.native
  val ENOTDIR: Double = js.native
  
  @JSImport("node:constants", "ENOTEMPTY")
  @js.native
  val ENOTEMPTY: Double = js.native
  
  @JSImport("node:constants", "ENOTSOCK")
  @js.native
  val ENOTSOCK: Double = js.native
  
  @JSImport("node:constants", "ENOTSUP")
  @js.native
  val ENOTSUP: Double = js.native
  
  @JSImport("node:constants", "ENOTTY")
  @js.native
  val ENOTTY: Double = js.native
  
  @JSImport("node:constants", "ENXIO")
  @js.native
  val ENXIO: Double = js.native
  
  @JSImport("node:constants", "EOPNOTSUPP")
  @js.native
  val EOPNOTSUPP: Double = js.native
  
  @JSImport("node:constants", "EOVERFLOW")
  @js.native
  val EOVERFLOW: Double = js.native
  
  @JSImport("node:constants", "EPERM")
  @js.native
  val EPERM: Double = js.native
  
  @JSImport("node:constants", "EPIPE")
  @js.native
  val EPIPE: Double = js.native
  
  @JSImport("node:constants", "EPROTO")
  @js.native
  val EPROTO: Double = js.native
  
  @JSImport("node:constants", "EPROTONOSUPPORT")
  @js.native
  val EPROTONOSUPPORT: Double = js.native
  
  @JSImport("node:constants", "EPROTOTYPE")
  @js.native
  val EPROTOTYPE: Double = js.native
  
  @JSImport("node:constants", "ERANGE")
  @js.native
  val ERANGE: Double = js.native
  
  @JSImport("node:constants", "EROFS")
  @js.native
  val EROFS: Double = js.native
  
  @JSImport("node:constants", "ESPIPE")
  @js.native
  val ESPIPE: Double = js.native
  
  @JSImport("node:constants", "ESRCH")
  @js.native
  val ESRCH: Double = js.native
  
  @JSImport("node:constants", "ESTALE")
  @js.native
  val ESTALE: Double = js.native
  
  @JSImport("node:constants", "ETIME")
  @js.native
  val ETIME: Double = js.native
  
  @JSImport("node:constants", "ETIMEDOUT")
  @js.native
  val ETIMEDOUT: Double = js.native
  
  @JSImport("node:constants", "ETXTBSY")
  @js.native
  val ETXTBSY: Double = js.native
  
  @JSImport("node:constants", "EWOULDBLOCK")
  @js.native
  val EWOULDBLOCK: Double = js.native
  
  @JSImport("node:constants", "EXDEV")
  @js.native
  val EXDEV: Double = js.native
  
  // File Access Constants
  /** Constant for fs.access(). File is visible to the calling process. */
  @JSImport("node:constants", "F_OK")
  @js.native
  val F_OK: Double = js.native
  
  // https://nodejs.org/dist/latest-v20.x/docs/api/crypto.html#crypto-constants
  @JSImport("node:constants", "OPENSSL_VERSION_NUMBER")
  @js.native
  val OPENSSL_VERSION_NUMBER: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
  @JSImport("node:constants", "O_APPEND")
  @js.native
  val O_APPEND: Double = js.native
  
  /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
  @JSImport("node:constants", "O_CREAT")
  @js.native
  val O_CREAT: Double = js.native
  
  /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
  @JSImport("node:constants", "O_DIRECT")
  @js.native
  val O_DIRECT: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
  @JSImport("node:constants", "O_DIRECTORY")
  @js.native
  val O_DIRECTORY: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
  @JSImport("node:constants", "O_DSYNC")
  @js.native
  val O_DSYNC: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
  @JSImport("node:constants", "O_EXCL")
  @js.native
  val O_EXCL: Double = js.native
  
  /**
    * constant for fs.open().
    * Flag indicating reading accesses to the file system will no longer result in
    * an update to the atime information associated with the file.
    * This flag is available on Linux operating systems only.
    */
  @JSImport("node:constants", "O_NOATIME")
  @js.native
  val O_NOATIME: Double = js.native
  
  /**
    * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
    * opening the path shall not cause that terminal to become the controlling terminal for the process
    * (if the process does not already have one).
    */
  @JSImport("node:constants", "O_NOCTTY")
  @js.native
  val O_NOCTTY: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
  @JSImport("node:constants", "O_NOFOLLOW")
  @js.native
  val O_NOFOLLOW: Double = js.native
  
  /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
  @JSImport("node:constants", "O_NONBLOCK")
  @js.native
  val O_NONBLOCK: Double = js.native
  
  // File Open Constants
  /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
  @JSImport("node:constants", "O_RDONLY")
  @js.native
  val O_RDONLY: Double = js.native
  
  /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
  @JSImport("node:constants", "O_RDWR")
  @js.native
  val O_RDWR: Double = js.native
  
  /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
  @JSImport("node:constants", "O_SYMLINK")
  @js.native
  val O_SYMLINK: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
  @JSImport("node:constants", "O_SYNC")
  @js.native
  val O_SYNC: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
  @JSImport("node:constants", "O_TRUNC")
  @js.native
  val O_TRUNC: Double = js.native
  
  /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
  @JSImport("node:constants", "O_WRONLY")
  @js.native
  val O_WRONLY: Double = js.native
  
  @JSImport("node:constants", "POINT_CONVERSION_COMPRESSED")
  @js.native
  val POINT_CONVERSION_COMPRESSED: Double = js.native
  
  @JSImport("node:constants", "POINT_CONVERSION_HYBRID")
  @js.native
  val POINT_CONVERSION_HYBRID: Double = js.native
  
  @JSImport("node:constants", "POINT_CONVERSION_UNCOMPRESSED")
  @js.native
  val POINT_CONVERSION_UNCOMPRESSED: Double = js.native
  
  @JSImport("node:constants", "PRIORITY_ABOVE_NORMAL")
  @js.native
  val PRIORITY_ABOVE_NORMAL: Double = js.native
  
  @JSImport("node:constants", "PRIORITY_BELOW_NORMAL")
  @js.native
  val PRIORITY_BELOW_NORMAL: Double = js.native
  
  @JSImport("node:constants", "PRIORITY_HIGH")
  @js.native
  val PRIORITY_HIGH: Double = js.native
  
  @JSImport("node:constants", "PRIORITY_HIGHEST")
  @js.native
  val PRIORITY_HIGHEST: Double = js.native
  
  @JSImport("node:constants", "PRIORITY_LOW")
  @js.native
  val PRIORITY_LOW: Double = js.native
  
  @JSImport("node:constants", "PRIORITY_NORMAL")
  @js.native
  val PRIORITY_NORMAL: Double = js.native
  
  @JSImport("node:constants", "RSA_NO_PADDING")
  @js.native
  val RSA_NO_PADDING: Double = js.native
  
  @JSImport("node:constants", "RSA_PKCS1_OAEP_PADDING")
  @js.native
  val RSA_PKCS1_OAEP_PADDING: Double = js.native
  
  @JSImport("node:constants", "RSA_PKCS1_PADDING")
  @js.native
  val RSA_PKCS1_PADDING: Double = js.native
  
  @JSImport("node:constants", "RSA_PKCS1_PSS_PADDING")
  @js.native
  val RSA_PKCS1_PSS_PADDING: Double = js.native
  
  /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
  @JSImport("node:constants", "RSA_PSS_SALTLEN_AUTO")
  @js.native
  val RSA_PSS_SALTLEN_AUTO: Double = js.native
  
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
  @JSImport("node:constants", "RSA_PSS_SALTLEN_DIGEST")
  @js.native
  val RSA_PSS_SALTLEN_DIGEST: Double = js.native
  
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
  @JSImport("node:constants", "RSA_PSS_SALTLEN_MAX_SIGN")
  @js.native
  val RSA_PSS_SALTLEN_MAX_SIGN: Double = js.native
  
  @JSImport("node:constants", "RSA_SSLV23_PADDING")
  @js.native
  val RSA_SSLV23_PADDING: Double = js.native
  
  @JSImport("node:constants", "RSA_X931_PADDING")
  @js.native
  val RSA_X931_PADDING: Double = js.native
  
  /** Constant for fs.access(). File can be read by the calling process. */
  @JSImport("node:constants", "R_OK")
  @js.native
  val R_OK: Double = js.native
  
  @JSImport("node:constants", "SIGABRT")
  @js.native
  def SIGABRT: Double = js.native
  inline def SIGABRT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGABRT")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGALRM")
  @js.native
  def SIGALRM: Double = js.native
  inline def SIGALRM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGALRM")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGBREAK")
  @js.native
  def SIGBREAK: Double = js.native
  inline def SIGBREAK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGBREAK")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGBUS")
  @js.native
  def SIGBUS: Double = js.native
  inline def SIGBUS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGBUS")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGCHLD")
  @js.native
  def SIGCHLD: Double = js.native
  inline def SIGCHLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGCHLD")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGCONT")
  @js.native
  def SIGCONT: Double = js.native
  inline def SIGCONT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGCONT")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGFPE")
  @js.native
  def SIGFPE: Double = js.native
  inline def SIGFPE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGFPE")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGHUP")
  @js.native
  def SIGHUP: Double = js.native
  inline def SIGHUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGHUP")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGILL")
  @js.native
  def SIGILL: Double = js.native
  inline def SIGILL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGILL")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGINFO")
  @js.native
  def SIGINFO: Double = js.native
  inline def SIGINFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGINFO")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGINT")
  @js.native
  def SIGINT: Double = js.native
  inline def SIGINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGINT")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGIO")
  @js.native
  def SIGIO: Double = js.native
  
  @JSImport("node:constants", "SIGIOT")
  @js.native
  def SIGIOT: Double = js.native
  inline def SIGIOT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGIOT")(x.asInstanceOf[js.Any])
  
  inline def SIGIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGIO")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGKILL")
  @js.native
  def SIGKILL: Double = js.native
  inline def SIGKILL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGKILL")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGLOST")
  @js.native
  def SIGLOST: Double = js.native
  inline def SIGLOST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGLOST")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGPIPE")
  @js.native
  def SIGPIPE: Double = js.native
  inline def SIGPIPE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGPIPE")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGPOLL")
  @js.native
  def SIGPOLL: Double = js.native
  inline def SIGPOLL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGPOLL")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGPROF")
  @js.native
  def SIGPROF: Double = js.native
  inline def SIGPROF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGPROF")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGPWR")
  @js.native
  def SIGPWR: Double = js.native
  inline def SIGPWR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGPWR")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGQUIT")
  @js.native
  def SIGQUIT: Double = js.native
  inline def SIGQUIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGQUIT")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGSEGV")
  @js.native
  def SIGSEGV: Double = js.native
  inline def SIGSEGV_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGSEGV")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGSTKFLT")
  @js.native
  def SIGSTKFLT: Double = js.native
  inline def SIGSTKFLT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGSTKFLT")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGSTOP")
  @js.native
  def SIGSTOP: Double = js.native
  inline def SIGSTOP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGSTOP")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGSYS")
  @js.native
  def SIGSYS: Double = js.native
  inline def SIGSYS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGSYS")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGTERM")
  @js.native
  def SIGTERM: Double = js.native
  inline def SIGTERM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGTERM")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGTRAP")
  @js.native
  def SIGTRAP: Double = js.native
  inline def SIGTRAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGTRAP")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGTSTP")
  @js.native
  def SIGTSTP: Double = js.native
  inline def SIGTSTP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGTSTP")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGTTIN")
  @js.native
  def SIGTTIN: Double = js.native
  inline def SIGTTIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGTTIN")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGTTOU")
  @js.native
  def SIGTTOU: Double = js.native
  inline def SIGTTOU_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGTTOU")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGUNUSED")
  @js.native
  def SIGUNUSED: Double = js.native
  inline def SIGUNUSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGUNUSED")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGURG")
  @js.native
  def SIGURG: Double = js.native
  inline def SIGURG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGURG")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGUSR1")
  @js.native
  def SIGUSR1: Double = js.native
  inline def SIGUSR1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGUSR1")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGUSR2")
  @js.native
  def SIGUSR2: Double = js.native
  inline def SIGUSR2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGUSR2")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGVTALRM")
  @js.native
  def SIGVTALRM: Double = js.native
  inline def SIGVTALRM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGVTALRM")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGWINCH")
  @js.native
  def SIGWINCH: Double = js.native
  inline def SIGWINCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGWINCH")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGXCPU")
  @js.native
  def SIGXCPU: Double = js.native
  inline def SIGXCPU_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGXCPU")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SIGXFSZ")
  @js.native
  def SIGXFSZ: Double = js.native
  inline def SIGXFSZ_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGXFSZ")(x.asInstanceOf[js.Any])
  
  @JSImport("node:constants", "SSL_OP_NO_SSLv2")
  @js.native
  val SSLOPNOSSLv2: Double = js.native
  
  @JSImport("node:constants", "SSL_OP_NO_SSLv3")
  @js.native
  val SSLOPNOSSLv3: Double = js.native
  
  @JSImport("node:constants", "SSL_OP_NO_TLSv1")
  @js.native
  val SSLOPNOTLSv1: Double = js.native
  
  @JSImport("node:constants", "SSL_OP_NO_TLSv1_1")
  @js.native
  val SSLOPNOTLSv11: Double = js.native
  
  @JSImport("node:constants", "SSL_OP_NO_TLSv1_2")
  @js.native
  val SSLOPNOTLSv12: Double = js.native
  
  /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
  @JSImport("node:constants", "SSL_OP_ALL")
  @js.native
  val SSL_OP_ALL: Double = js.native
  
  /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  @JSImport("node:constants", "SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION")
  @js.native
  val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double = js.native
  
  /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  @JSImport("node:constants", "SSL_OP_CIPHER_SERVER_PREFERENCE")
  @js.native
  val SSL_OP_CIPHER_SERVER_PREFERENCE: Double = js.native
  
  /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
  @JSImport("node:constants", "SSL_OP_CISCO_ANYCONNECT")
  @js.native
  val SSL_OP_CISCO_ANYCONNECT: Double = js.native
  
  /** Instructs OpenSSL to turn on cookie exchange. */
  @JSImport("node:constants", "SSL_OP_COOKIE_EXCHANGE")
  @js.native
  val SSL_OP_COOKIE_EXCHANGE: Double = js.native
  
  /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
  @JSImport("node:constants", "SSL_OP_CRYPTOPRO_TLSEXT_BUG")
  @js.native
  val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double = js.native
  
  /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
  @JSImport("node:constants", "SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS")
  @js.native
  val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double = js.native
  
  /** Allows initial connection to servers that do not support RI. */
  @JSImport("node:constants", "SSL_OP_LEGACY_SERVER_CONNECT")
  @js.native
  val SSL_OP_LEGACY_SERVER_CONNECT: Double = js.native
  
  /** Instructs OpenSSL to disable support for SSL/TLS compression. */
  @JSImport("node:constants", "SSL_OP_NO_COMPRESSION")
  @js.native
  val SSL_OP_NO_COMPRESSION: Double = js.native
  
  @JSImport("node:constants", "SSL_OP_NO_QUERY_MTU")
  @js.native
  val SSL_OP_NO_QUERY_MTU: Double = js.native
  
  /** Instructs OpenSSL to always start a new session when performing renegotiation. */
  @JSImport("node:constants", "SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION")
  @js.native
  val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double = js.native
  
  @JSImport("node:constants", "SSL_OP_NO_TICKET")
  @js.native
  val SSL_OP_NO_TICKET: Double = js.native
  
  /** Instructs OpenSSL to disable version rollback attack detection. */
  @JSImport("node:constants", "SSL_OP_TLS_ROLLBACK_BUG")
  @js.native
  val SSL_OP_TLS_ROLLBACK_BUG: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
  @JSImport("node:constants", "S_IFBLK")
  @js.native
  val S_IFBLK: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
  @JSImport("node:constants", "S_IFCHR")
  @js.native
  val S_IFCHR: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
  @JSImport("node:constants", "S_IFDIR")
  @js.native
  val S_IFDIR: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
  @JSImport("node:constants", "S_IFIFO")
  @js.native
  val S_IFIFO: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
  @JSImport("node:constants", "S_IFLNK")
  @js.native
  val S_IFLNK: Double = js.native
  
  // File Type Constants
  /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
  @JSImport("node:constants", "S_IFMT")
  @js.native
  val S_IFMT: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
  @JSImport("node:constants", "S_IFREG")
  @js.native
  val S_IFREG: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
  @JSImport("node:constants", "S_IFSOCK")
  @js.native
  val S_IFSOCK: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
  @JSImport("node:constants", "S_IRGRP")
  @js.native
  val S_IRGRP: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
  @JSImport("node:constants", "S_IROTH")
  @js.native
  val S_IROTH: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
  @JSImport("node:constants", "S_IRUSR")
  @js.native
  val S_IRUSR: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
  @JSImport("node:constants", "S_IRWXG")
  @js.native
  val S_IRWXG: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
  @JSImport("node:constants", "S_IRWXO")
  @js.native
  val S_IRWXO: Double = js.native
  
  // File Mode Constants
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
  @JSImport("node:constants", "S_IRWXU")
  @js.native
  val S_IRWXU: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
  @JSImport("node:constants", "S_IWGRP")
  @js.native
  val S_IWGRP: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
  @JSImport("node:constants", "S_IWOTH")
  @js.native
  val S_IWOTH: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
  @JSImport("node:constants", "S_IWUSR")
  @js.native
  val S_IWUSR: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
  @JSImport("node:constants", "S_IXGRP")
  @js.native
  val S_IXGRP: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
  @JSImport("node:constants", "S_IXOTH")
  @js.native
  val S_IXOTH: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
  @JSImport("node:constants", "S_IXUSR")
  @js.native
  val S_IXUSR: Double = js.native
  
  /**
    * When set, a memory file mapping is used to access the file. This flag
    * is available on Windows operating systems only. On other operating systems,
    * this flag is ignored.
    */
  @JSImport("node:constants", "UV_FS_O_FILEMAP")
  @js.native
  val UV_FS_O_FILEMAP: Double = js.native
  
  @JSImport("node:constants", "WSAEACCES")
  @js.native
  val WSAEACCES: Double = js.native
  
  @JSImport("node:constants", "WSAEADDRINUSE")
  @js.native
  val WSAEADDRINUSE: Double = js.native
  
  @JSImport("node:constants", "WSAEADDRNOTAVAIL")
  @js.native
  val WSAEADDRNOTAVAIL: Double = js.native
  
  @JSImport("node:constants", "WSAEAFNOSUPPORT")
  @js.native
  val WSAEAFNOSUPPORT: Double = js.native
  
  @JSImport("node:constants", "WSAEALREADY")
  @js.native
  val WSAEALREADY: Double = js.native
  
  @JSImport("node:constants", "WSAEBADF")
  @js.native
  val WSAEBADF: Double = js.native
  
  @JSImport("node:constants", "WSAECANCELLED")
  @js.native
  val WSAECANCELLED: Double = js.native
  
  @JSImport("node:constants", "WSAECONNABORTED")
  @js.native
  val WSAECONNABORTED: Double = js.native
  
  @JSImport("node:constants", "WSAECONNREFUSED")
  @js.native
  val WSAECONNREFUSED: Double = js.native
  
  @JSImport("node:constants", "WSAECONNRESET")
  @js.native
  val WSAECONNRESET: Double = js.native
  
  @JSImport("node:constants", "WSAEDESTADDRREQ")
  @js.native
  val WSAEDESTADDRREQ: Double = js.native
  
  @JSImport("node:constants", "WSAEDISCON")
  @js.native
  val WSAEDISCON: Double = js.native
  
  @JSImport("node:constants", "WSAEDQUOT")
  @js.native
  val WSAEDQUOT: Double = js.native
  
  @JSImport("node:constants", "WSAEFAULT")
  @js.native
  val WSAEFAULT: Double = js.native
  
  @JSImport("node:constants", "WSAEHOSTDOWN")
  @js.native
  val WSAEHOSTDOWN: Double = js.native
  
  @JSImport("node:constants", "WSAEHOSTUNREACH")
  @js.native
  val WSAEHOSTUNREACH: Double = js.native
  
  @JSImport("node:constants", "WSAEINPROGRESS")
  @js.native
  val WSAEINPROGRESS: Double = js.native
  
  @JSImport("node:constants", "WSAEINTR")
  @js.native
  val WSAEINTR: Double = js.native
  
  @JSImport("node:constants", "WSAEINVAL")
  @js.native
  val WSAEINVAL: Double = js.native
  
  @JSImport("node:constants", "WSAEINVALIDPROCTABLE")
  @js.native
  val WSAEINVALIDPROCTABLE: Double = js.native
  
  @JSImport("node:constants", "WSAEINVALIDPROVIDER")
  @js.native
  val WSAEINVALIDPROVIDER: Double = js.native
  
  @JSImport("node:constants", "WSAEISCONN")
  @js.native
  val WSAEISCONN: Double = js.native
  
  @JSImport("node:constants", "WSAELOOP")
  @js.native
  val WSAELOOP: Double = js.native
  
  @JSImport("node:constants", "WSAEMFILE")
  @js.native
  val WSAEMFILE: Double = js.native
  
  @JSImport("node:constants", "WSAEMSGSIZE")
  @js.native
  val WSAEMSGSIZE: Double = js.native
  
  @JSImport("node:constants", "WSAENAMETOOLONG")
  @js.native
  val WSAENAMETOOLONG: Double = js.native
  
  @JSImport("node:constants", "WSAENETDOWN")
  @js.native
  val WSAENETDOWN: Double = js.native
  
  @JSImport("node:constants", "WSAENETRESET")
  @js.native
  val WSAENETRESET: Double = js.native
  
  @JSImport("node:constants", "WSAENETUNREACH")
  @js.native
  val WSAENETUNREACH: Double = js.native
  
  @JSImport("node:constants", "WSAENOBUFS")
  @js.native
  val WSAENOBUFS: Double = js.native
  
  @JSImport("node:constants", "WSAENOMORE")
  @js.native
  val WSAENOMORE: Double = js.native
  
  @JSImport("node:constants", "WSAENOPROTOOPT")
  @js.native
  val WSAENOPROTOOPT: Double = js.native
  
  @JSImport("node:constants", "WSAENOTCONN")
  @js.native
  val WSAENOTCONN: Double = js.native
  
  @JSImport("node:constants", "WSAENOTEMPTY")
  @js.native
  val WSAENOTEMPTY: Double = js.native
  
  @JSImport("node:constants", "WSAENOTSOCK")
  @js.native
  val WSAENOTSOCK: Double = js.native
  
  @JSImport("node:constants", "WSAEOPNOTSUPP")
  @js.native
  val WSAEOPNOTSUPP: Double = js.native
  
  @JSImport("node:constants", "WSAEPFNOSUPPORT")
  @js.native
  val WSAEPFNOSUPPORT: Double = js.native
  
  @JSImport("node:constants", "WSAEPROCLIM")
  @js.native
  val WSAEPROCLIM: Double = js.native
  
  @JSImport("node:constants", "WSAEPROTONOSUPPORT")
  @js.native
  val WSAEPROTONOSUPPORT: Double = js.native
  
  @JSImport("node:constants", "WSAEPROTOTYPE")
  @js.native
  val WSAEPROTOTYPE: Double = js.native
  
  @JSImport("node:constants", "WSAEPROVIDERFAILEDINIT")
  @js.native
  val WSAEPROVIDERFAILEDINIT: Double = js.native
  
  @JSImport("node:constants", "WSAEREFUSED")
  @js.native
  val WSAEREFUSED: Double = js.native
  
  @JSImport("node:constants", "WSAEREMOTE")
  @js.native
  val WSAEREMOTE: Double = js.native
  
  @JSImport("node:constants", "WSAESHUTDOWN")
  @js.native
  val WSAESHUTDOWN: Double = js.native
  
  @JSImport("node:constants", "WSAESOCKTNOSUPPORT")
  @js.native
  val WSAESOCKTNOSUPPORT: Double = js.native
  
  @JSImport("node:constants", "WSAESTALE")
  @js.native
  val WSAESTALE: Double = js.native
  
  @JSImport("node:constants", "WSAETIMEDOUT")
  @js.native
  val WSAETIMEDOUT: Double = js.native
  
  @JSImport("node:constants", "WSAETOOMANYREFS")
  @js.native
  val WSAETOOMANYREFS: Double = js.native
  
  @JSImport("node:constants", "WSAEUSERS")
  @js.native
  val WSAEUSERS: Double = js.native
  
  @JSImport("node:constants", "WSAEWOULDBLOCK")
  @js.native
  val WSAEWOULDBLOCK: Double = js.native
  
  @JSImport("node:constants", "WSANOTINITIALISED")
  @js.native
  val WSANOTINITIALISED: Double = js.native
  
  @JSImport("node:constants", "WSASERVICE_NOT_FOUND")
  @js.native
  val WSASERVICE_NOT_FOUND: Double = js.native
  
  @JSImport("node:constants", "WSASYSCALLFAILURE")
  @js.native
  val WSASYSCALLFAILURE: Double = js.native
  
  @JSImport("node:constants", "WSASYSNOTREADY")
  @js.native
  val WSASYSNOTREADY: Double = js.native
  
  @JSImport("node:constants", "WSATYPE_NOT_FOUND")
  @js.native
  val WSATYPE_NOT_FOUND: Double = js.native
  
  @JSImport("node:constants", "WSAVERNOTSUPPORTED")
  @js.native
  val WSAVERNOTSUPPORTED: Double = js.native
  
  @JSImport("node:constants", "WSA_E_CANCELLED")
  @js.native
  val WSA_E_CANCELLED: Double = js.native
  
  @JSImport("node:constants", "WSA_E_NO_MORE")
  @js.native
  val WSA_E_NO_MORE: Double = js.native
  
  /** Constant for fs.access(). File can be written by the calling process. */
  @JSImport("node:constants", "W_OK")
  @js.native
  val W_OK: Double = js.native
  
  /** Constant for fs.access(). File can be executed by the calling process. */
  @JSImport("node:constants", "X_OK")
  @js.native
  val X_OK: Double = js.native
  
  /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
  @JSImport("node:constants", "defaultCipherList")
  @js.native
  val defaultCipherList: String = js.native
  
  /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
  @JSImport("node:constants", "defaultCoreCipherList")
  @js.native
  val defaultCoreCipherList: String = js.native
}
