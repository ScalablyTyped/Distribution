package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val ALPN_ENABLED: Double = js.native
  // File Copy Constants
  /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
  val COPYFILE_EXCL: Double = js.native
  /**
    * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
    */
  val COPYFILE_FICLONE: Double = js.native
  /**
    * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
    */
  val COPYFILE_FICLONE_FORCE: Double = js.native
  val DH_CHECK_P_NOT_PRIME: Double = js.native
  val DH_CHECK_P_NOT_SAFE_PRIME: Double = js.native
  val DH_NOT_SUITABLE_GENERATOR: Double = js.native
  val DH_UNABLE_TO_CHECK_GENERATOR: Double = js.native
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
  val ENGINE_METHOD_ALL: Double = js.native
  val ENGINE_METHOD_CIPHERS: Double = js.native
  val ENGINE_METHOD_DH: Double = js.native
  val ENGINE_METHOD_DIGESTS: Double = js.native
  val ENGINE_METHOD_DSA: Double = js.native
  val ENGINE_METHOD_EC: Double = js.native
  val ENGINE_METHOD_NONE: Double = js.native
  val ENGINE_METHOD_PKEY_ASN1_METHS: Double = js.native
  val ENGINE_METHOD_PKEY_METHS: Double = js.native
  val ENGINE_METHOD_RAND: Double = js.native
  val ENGINE_METHOD_RSA: Double = js.native
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
  // File Access Constants
  /** Constant for fs.access(). File is visible to the calling process. */
  val F_OK: Double = js.native
  // https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
  val OPENSSL_VERSION_NUMBER: Double = js.native
  /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
  val O_APPEND: Double = js.native
  /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
  val O_CREAT: Double = js.native
  /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
  val O_DIRECT: Double = js.native
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
  val O_DIRECTORY: Double = js.native
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
  val O_DSYNC: Double = js.native
  /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
  val O_EXCL: Double = js.native
  /**
    * constant for fs.open().
    * Flag indicating reading accesses to the file system will no longer result in
    * an update to the atime information associated with the file.
    * This flag is available on Linux operating systems only.
    */
  val O_NOATIME: Double = js.native
  /**
    * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
    * opening the path shall not cause that terminal to become the controlling terminal for the process
    * (if the process does not already have one).
    */
  val O_NOCTTY: Double = js.native
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
  val O_NOFOLLOW: Double = js.native
  /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
  val O_NONBLOCK: Double = js.native
  // File Open Constants
  /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
  val O_RDONLY: Double = js.native
  /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
  val O_RDWR: Double = js.native
  /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
  val O_SYMLINK: Double = js.native
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
  val O_SYNC: Double = js.native
  /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
  val O_TRUNC: Double = js.native
  /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
  val O_WRONLY: Double = js.native
  val POINT_CONVERSION_COMPRESSED: Double = js.native
  val POINT_CONVERSION_HYBRID: Double = js.native
  val POINT_CONVERSION_UNCOMPRESSED: Double = js.native
  val PRIORITY_ABOVE_NORMAL: Double = js.native
  val PRIORITY_BELOW_NORMAL: Double = js.native
  val PRIORITY_HIGH: Double = js.native
  val PRIORITY_HIGHEST: Double = js.native
  val PRIORITY_LOW: Double = js.native
  val PRIORITY_NORMAL: Double = js.native
  val RSA_NO_PADDING: Double = js.native
  val RSA_PKCS1_OAEP_PADDING: Double = js.native
  val RSA_PKCS1_PADDING: Double = js.native
  val RSA_PKCS1_PSS_PADDING: Double = js.native
  /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
  val RSA_PSS_SALTLEN_AUTO: Double = js.native
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
  val RSA_PSS_SALTLEN_DIGEST: Double = js.native
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
  val RSA_PSS_SALTLEN_MAX_SIGN: Double = js.native
  val RSA_SSLV23_PADDING: Double = js.native
  val RSA_X931_PADDING: Double = js.native
  /** Constant for fs.access(). File can be read by the calling process. */
  val R_OK: Double = js.native
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
  /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
  val SSL_OP_ALL: Double = js.native
  /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double = js.native
  /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  val SSL_OP_CIPHER_SERVER_PREFERENCE: Double = js.native
  /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
  val SSL_OP_CISCO_ANYCONNECT: Double = js.native
  /** Instructs OpenSSL to turn on cookie exchange. */
  val SSL_OP_COOKIE_EXCHANGE: Double = js.native
  /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
  val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double = js.native
  /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
  val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double = js.native
  /** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
  val SSL_OP_EPHEMERAL_RSA: Double = js.native
  /** Allows initial connection to servers that do not support RI. */
  val SSL_OP_LEGACY_SERVER_CONNECT: Double = js.native
  val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Double = js.native
  val SSL_OP_MICROSOFT_SESS_ID_BUG: Double = js.native
  /** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
  val SSL_OP_MSIE_SSLV2_RSA_PADDING: Double = js.native
  val SSL_OP_NETSCAPE_CA_DN_BUG: Double = js.native
  val SSL_OP_NETSCAPE_CHALLENGE_BUG: Double = js.native
  val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Double = js.native
  val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Double = js.native
  /** Instructs OpenSSL to disable support for SSL/TLS compression. */
  val SSL_OP_NO_COMPRESSION: Double = js.native
  val SSL_OP_NO_QUERY_MTU: Double = js.native
  /** Instructs OpenSSL to always start a new session when performing renegotiation. */
  val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double = js.native
  val SSL_OP_NO_SSLv2: Double = js.native
  val SSL_OP_NO_SSLv3: Double = js.native
  val SSL_OP_NO_TICKET: Double = js.native
  val SSL_OP_NO_TLSv1: Double = js.native
  val SSL_OP_NO_TLSv1_1: Double = js.native
  val SSL_OP_NO_TLSv1_2: Double = js.native
  val SSL_OP_PKCS1_CHECK_1: Double = js.native
  val SSL_OP_PKCS1_CHECK_2: Double = js.native
  /** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
  val SSL_OP_SINGLE_DH_USE: Double = js.native
  /** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
  val SSL_OP_SINGLE_ECDH_USE: Double = js.native
  val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Double = js.native
  val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Double = js.native
  val SSL_OP_TLS_BLOCK_PADDING_BUG: Double = js.native
  val SSL_OP_TLS_D5_BUG: Double = js.native
  /** Instructs OpenSSL to disable version rollback attack detection. */
  val SSL_OP_TLS_ROLLBACK_BUG: Double = js.native
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
  val S_IFBLK: Double = js.native
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
  val S_IFCHR: Double = js.native
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
  val S_IFDIR: Double = js.native
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
  val S_IFIFO: Double = js.native
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
  val S_IFLNK: Double = js.native
  // File Type Constants
  /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
  val S_IFMT: Double = js.native
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
  val S_IFREG: Double = js.native
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
  val S_IFSOCK: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
  val S_IRGRP: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
  val S_IROTH: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
  val S_IRUSR: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
  val S_IRWXG: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
  val S_IRWXO: Double = js.native
  // File Mode Constants
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
  val S_IRWXU: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
  val S_IWGRP: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
  val S_IWOTH: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
  val S_IWUSR: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
  val S_IXGRP: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
  val S_IXOTH: Double = js.native
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
  val S_IXUSR: Double = js.native
  /**
    * When set, a memory file mapping is used to access the file. This flag
    * is available on Windows operating systems only. On other operating systems,
    * this flag is ignored.
    */
  val UV_FS_O_FILEMAP: Double = js.native
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
  /** Constant for fs.access(). File can be written by the calling process. */
  val W_OK: Double = js.native
  /** Constant for fs.access(). File can be executed by the calling process. */
  val X_OK: Double = js.native
  /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
  val defaultCipherList: java.lang.String = js.native
  /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
  val defaultCoreCipherList: java.lang.String = js.native
}

