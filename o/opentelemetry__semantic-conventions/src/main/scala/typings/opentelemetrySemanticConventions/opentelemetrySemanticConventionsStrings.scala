package typings.opentelemetrySemanticConventions

import typings.opentelemetrySemanticConventions.buildSrcResourceSemanticResourceAttributesMod.AwsEcsLaunchtypeValues
import typings.opentelemetrySemanticConventions.buildSrcResourceSemanticResourceAttributesMod.CloudPlatformValues
import typings.opentelemetrySemanticConventions.buildSrcResourceSemanticResourceAttributesMod.CloudProviderValues
import typings.opentelemetrySemanticConventions.buildSrcResourceSemanticResourceAttributesMod.HostArchValues
import typings.opentelemetrySemanticConventions.buildSrcResourceSemanticResourceAttributesMod.OsTypeValues
import typings.opentelemetrySemanticConventions.buildSrcResourceSemanticResourceAttributesMod.TelemetrySdkLanguageValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.DbCassandraConsistencyLevelValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.DbSystemValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.FaasDocumentOperationValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.FaasInvokedProviderValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.FaasTriggerValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.HttpFlavorValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.MessageTypeValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.MessagingDestinationKindValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.MessagingOperationValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.NetHostConnectionSubtypeValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.NetHostConnectionTypeValues
import typings.opentelemetrySemanticConventions.buildSrcTraceSemanticAttributesMod.NetTransportValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opentelemetrySemanticConventionsStrings {
  
  @js.native
  sealed trait `1Dot0`
    extends StObject
       with HttpFlavorValues
  inline def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  
  @js.native
  sealed trait `1Dot1`
    extends StObject
       with HttpFlavorValues
  inline def `1Dot1`: `1Dot1` = "1.1".asInstanceOf[`1Dot1`]
  
  @js.native
  sealed trait `2Dot0`
    extends StObject
       with HttpFlavorValues
  inline def `2Dot0`: `2Dot0` = "2.0".asInstanceOf[`2Dot0`]
  
  @js.native
  sealed trait QUIC
    extends StObject
       with HttpFlavorValues
  inline def QUIC: QUIC = "QUIC".asInstanceOf[QUIC]
  
  @js.native
  sealed trait RECEIVED
    extends StObject
       with MessageTypeValues
  inline def RECEIVED: RECEIVED = "RECEIVED".asInstanceOf[RECEIVED]
  
  @js.native
  sealed trait SENT
    extends StObject
       with MessageTypeValues
  inline def SENT: SENT = "SENT".asInstanceOf[SENT]
  
  @js.native
  sealed trait SPDY
    extends StObject
       with HttpFlavorValues
  inline def SPDY: SPDY = "SPDY".asInstanceOf[SPDY]
  
  @js.native
  sealed trait adabas
    extends StObject
       with DbSystemValues
  inline def adabas: adabas = "adabas".asInstanceOf[adabas]
  
  @js.native
  sealed trait aix
    extends StObject
       with OsTypeValues
  inline def aix: aix = "aix".asInstanceOf[aix]
  
  @js.native
  sealed trait alibaba_cloud
    extends StObject
       with CloudProviderValues
       with FaasInvokedProviderValues
  inline def alibaba_cloud: alibaba_cloud = "alibaba_cloud".asInstanceOf[alibaba_cloud]
  
  @js.native
  sealed trait alibaba_cloud_ecs
    extends StObject
       with CloudPlatformValues
  inline def alibaba_cloud_ecs: alibaba_cloud_ecs = "alibaba_cloud_ecs".asInstanceOf[alibaba_cloud_ecs]
  
  @js.native
  sealed trait alibaba_cloud_fc
    extends StObject
       with CloudPlatformValues
  inline def alibaba_cloud_fc: alibaba_cloud_fc = "alibaba_cloud_fc".asInstanceOf[alibaba_cloud_fc]
  
  @js.native
  sealed trait all
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait amd64
    extends StObject
       with HostArchValues
  inline def amd64: amd64 = "amd64".asInstanceOf[amd64]
  
  @js.native
  sealed trait any
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait arm32
    extends StObject
       with HostArchValues
  inline def arm32: arm32 = "arm32".asInstanceOf[arm32]
  
  @js.native
  sealed trait arm64
    extends StObject
       with HostArchValues
  inline def arm64: arm64 = "arm64".asInstanceOf[arm64]
  
  @js.native
  sealed trait aws
    extends StObject
       with CloudProviderValues
       with FaasInvokedProviderValues
  inline def aws: aws = "aws".asInstanceOf[aws]
  
  @js.native
  sealed trait aws_ec2
    extends StObject
       with CloudPlatformValues
  inline def aws_ec2: aws_ec2 = "aws_ec2".asInstanceOf[aws_ec2]
  
  @js.native
  sealed trait aws_ecs
    extends StObject
       with CloudPlatformValues
  inline def aws_ecs: aws_ecs = "aws_ecs".asInstanceOf[aws_ecs]
  
  @js.native
  sealed trait aws_eks
    extends StObject
       with CloudPlatformValues
  inline def aws_eks: aws_eks = "aws_eks".asInstanceOf[aws_eks]
  
  @js.native
  sealed trait aws_elastic_beanstalk
    extends StObject
       with CloudPlatformValues
  inline def aws_elastic_beanstalk: aws_elastic_beanstalk = "aws_elastic_beanstalk".asInstanceOf[aws_elastic_beanstalk]
  
  @js.native
  sealed trait aws_lambda
    extends StObject
       with CloudPlatformValues
  inline def aws_lambda: aws_lambda = "aws_lambda".asInstanceOf[aws_lambda]
  
  @js.native
  sealed trait azure
    extends StObject
       with CloudProviderValues
       with FaasInvokedProviderValues
  inline def azure: azure = "azure".asInstanceOf[azure]
  
  @js.native
  sealed trait azure_aks
    extends StObject
       with CloudPlatformValues
  inline def azure_aks: azure_aks = "azure_aks".asInstanceOf[azure_aks]
  
  @js.native
  sealed trait azure_app_service
    extends StObject
       with CloudPlatformValues
  inline def azure_app_service: azure_app_service = "azure_app_service".asInstanceOf[azure_app_service]
  
  @js.native
  sealed trait azure_container_instances
    extends StObject
       with CloudPlatformValues
  inline def azure_container_instances: azure_container_instances = "azure_container_instances".asInstanceOf[azure_container_instances]
  
  @js.native
  sealed trait azure_functions
    extends StObject
       with CloudPlatformValues
  inline def azure_functions: azure_functions = "azure_functions".asInstanceOf[azure_functions]
  
  @js.native
  sealed trait azure_vm
    extends StObject
       with CloudPlatformValues
  inline def azure_vm: azure_vm = "azure_vm".asInstanceOf[azure_vm]
  
  @js.native
  sealed trait cache
    extends StObject
       with DbSystemValues
  inline def cache: cache = "cache".asInstanceOf[cache]
  
  @js.native
  sealed trait cassandra
    extends StObject
       with DbSystemValues
  inline def cassandra: cassandra = "cassandra".asInstanceOf[cassandra]
  
  @js.native
  sealed trait cdma
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def cdma: cdma = "cdma".asInstanceOf[cdma]
  
  @js.native
  sealed trait cdma2000_1xrtt
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def cdma2000_1xrtt: cdma2000_1xrtt = "cdma2000_1xrtt".asInstanceOf[cdma2000_1xrtt]
  
  @js.native
  sealed trait cell
    extends StObject
       with NetHostConnectionTypeValues
  inline def cell: cell = "cell".asInstanceOf[cell]
  
  @js.native
  sealed trait cloudscape
    extends StObject
       with DbSystemValues
  inline def cloudscape: cloudscape = "cloudscape".asInstanceOf[cloudscape]
  
  @js.native
  sealed trait cockroachdb
    extends StObject
       with DbSystemValues
  inline def cockroachdb: cockroachdb = "cockroachdb".asInstanceOf[cockroachdb]
  
  @js.native
  sealed trait coldfusion
    extends StObject
       with DbSystemValues
  inline def coldfusion: coldfusion = "coldfusion".asInstanceOf[coldfusion]
  
  @js.native
  sealed trait cosmosdb
    extends StObject
       with DbSystemValues
  inline def cosmosdb: cosmosdb = "cosmosdb".asInstanceOf[cosmosdb]
  
  @js.native
  sealed trait couchbase
    extends StObject
       with DbSystemValues
  inline def couchbase: couchbase = "couchbase".asInstanceOf[couchbase]
  
  @js.native
  sealed trait couchdb
    extends StObject
       with DbSystemValues
  inline def couchdb: couchdb = "couchdb".asInstanceOf[couchdb]
  
  @js.native
  sealed trait cpp
    extends StObject
       with TelemetrySdkLanguageValues
  inline def cpp: cpp = "cpp".asInstanceOf[cpp]
  
  @js.native
  sealed trait darwin
    extends StObject
       with OsTypeValues
  inline def darwin: darwin = "darwin".asInstanceOf[darwin]
  
  @js.native
  sealed trait datasource
    extends StObject
       with FaasTriggerValues
  inline def datasource: datasource = "datasource".asInstanceOf[datasource]
  
  @js.native
  sealed trait db2
    extends StObject
       with DbSystemValues
  inline def db2: db2 = "db2".asInstanceOf[db2]
  
  @js.native
  sealed trait delete
    extends StObject
       with FaasDocumentOperationValues
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait derby
    extends StObject
       with DbSystemValues
  inline def derby: derby = "derby".asInstanceOf[derby]
  
  @js.native
  sealed trait dotnet
    extends StObject
       with TelemetrySdkLanguageValues
  inline def dotnet: dotnet = "dotnet".asInstanceOf[dotnet]
  
  @js.native
  sealed trait dragonflybsd
    extends StObject
       with OsTypeValues
  inline def dragonflybsd: dragonflybsd = "dragonflybsd".asInstanceOf[dragonflybsd]
  
  @js.native
  sealed trait dynamodb
    extends StObject
       with DbSystemValues
  inline def dynamodb: dynamodb = "dynamodb".asInstanceOf[dynamodb]
  
  @js.native
  sealed trait each_quorum
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def each_quorum: each_quorum = "each_quorum".asInstanceOf[each_quorum]
  
  @js.native
  sealed trait ec2
    extends StObject
       with AwsEcsLaunchtypeValues
  inline def ec2: ec2 = "ec2".asInstanceOf[ec2]
  
  @js.native
  sealed trait edb
    extends StObject
       with DbSystemValues
  inline def edb: edb = "edb".asInstanceOf[edb]
  
  @js.native
  sealed trait edge
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def edge: edge = "edge".asInstanceOf[edge]
  
  @js.native
  sealed trait edit
    extends StObject
       with FaasDocumentOperationValues
  inline def edit: edit = "edit".asInstanceOf[edit]
  
  @js.native
  sealed trait ehrpd
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def ehrpd: ehrpd = "ehrpd".asInstanceOf[ehrpd]
  
  @js.native
  sealed trait elasticsearch
    extends StObject
       with DbSystemValues
  inline def elasticsearch: elasticsearch = "elasticsearch".asInstanceOf[elasticsearch]
  
  @js.native
  sealed trait erlang
    extends StObject
       with TelemetrySdkLanguageValues
  inline def erlang: erlang = "erlang".asInstanceOf[erlang]
  
  @js.native
  sealed trait evdo_0
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def evdo_0: evdo_0 = "evdo_0".asInstanceOf[evdo_0]
  
  @js.native
  sealed trait evdo_a
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def evdo_a: evdo_a = "evdo_a".asInstanceOf[evdo_a]
  
  @js.native
  sealed trait evdo_b
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def evdo_b: evdo_b = "evdo_b".asInstanceOf[evdo_b]
  
  @js.native
  sealed trait fargate
    extends StObject
       with AwsEcsLaunchtypeValues
  inline def fargate: fargate = "fargate".asInstanceOf[fargate]
  
  @js.native
  sealed trait filemaker
    extends StObject
       with DbSystemValues
  inline def filemaker: filemaker = "filemaker".asInstanceOf[filemaker]
  
  @js.native
  sealed trait firebird
    extends StObject
       with DbSystemValues
  inline def firebird: firebird = "firebird".asInstanceOf[firebird]
  
  @js.native
  sealed trait firstsql
    extends StObject
       with DbSystemValues
  inline def firstsql: firstsql = "firstsql".asInstanceOf[firstsql]
  
  @js.native
  sealed trait freebsd
    extends StObject
       with OsTypeValues
  inline def freebsd: freebsd = "freebsd".asInstanceOf[freebsd]
  
  @js.native
  sealed trait gcp
    extends StObject
       with CloudProviderValues
       with FaasInvokedProviderValues
  inline def gcp: gcp = "gcp".asInstanceOf[gcp]
  
  @js.native
  sealed trait gcp_app_engine
    extends StObject
       with CloudPlatformValues
  inline def gcp_app_engine: gcp_app_engine = "gcp_app_engine".asInstanceOf[gcp_app_engine]
  
  @js.native
  sealed trait gcp_cloud_functions
    extends StObject
       with CloudPlatformValues
  inline def gcp_cloud_functions: gcp_cloud_functions = "gcp_cloud_functions".asInstanceOf[gcp_cloud_functions]
  
  @js.native
  sealed trait gcp_cloud_run
    extends StObject
       with CloudPlatformValues
  inline def gcp_cloud_run: gcp_cloud_run = "gcp_cloud_run".asInstanceOf[gcp_cloud_run]
  
  @js.native
  sealed trait gcp_compute_engine
    extends StObject
       with CloudPlatformValues
  inline def gcp_compute_engine: gcp_compute_engine = "gcp_compute_engine".asInstanceOf[gcp_compute_engine]
  
  @js.native
  sealed trait gcp_kubernetes_engine
    extends StObject
       with CloudPlatformValues
  inline def gcp_kubernetes_engine: gcp_kubernetes_engine = "gcp_kubernetes_engine".asInstanceOf[gcp_kubernetes_engine]
  
  @js.native
  sealed trait geode
    extends StObject
       with DbSystemValues
  inline def geode: geode = "geode".asInstanceOf[geode]
  
  @js.native
  sealed trait go
    extends StObject
       with TelemetrySdkLanguageValues
  inline def go: go = "go".asInstanceOf[go]
  
  @js.native
  sealed trait gprs
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def gprs: gprs = "gprs".asInstanceOf[gprs]
  
  @js.native
  sealed trait gsm
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def gsm: gsm = "gsm".asInstanceOf[gsm]
  
  @js.native
  sealed trait h2
    extends StObject
       with DbSystemValues
  inline def h2: h2 = "h2".asInstanceOf[h2]
  
  @js.native
  sealed trait hanadb
    extends StObject
       with DbSystemValues
  inline def hanadb: hanadb = "hanadb".asInstanceOf[hanadb]
  
  @js.native
  sealed trait hbase
    extends StObject
       with DbSystemValues
  inline def hbase: hbase = "hbase".asInstanceOf[hbase]
  
  @js.native
  sealed trait hive
    extends StObject
       with DbSystemValues
  inline def hive: hive = "hive".asInstanceOf[hive]
  
  @js.native
  sealed trait hpux
    extends StObject
       with OsTypeValues
  inline def hpux: hpux = "hpux".asInstanceOf[hpux]
  
  @js.native
  sealed trait hsdpa
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def hsdpa: hsdpa = "hsdpa".asInstanceOf[hsdpa]
  
  @js.native
  sealed trait hspa
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def hspa: hspa = "hspa".asInstanceOf[hspa]
  
  @js.native
  sealed trait hspap
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def hspap: hspap = "hspap".asInstanceOf[hspap]
  
  @js.native
  sealed trait hsqldb
    extends StObject
       with DbSystemValues
  inline def hsqldb: hsqldb = "hsqldb".asInstanceOf[hsqldb]
  
  @js.native
  sealed trait hsupa
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def hsupa: hsupa = "hsupa".asInstanceOf[hsupa]
  
  @js.native
  sealed trait http
    extends StObject
       with FaasTriggerValues
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait ia64
    extends StObject
       with HostArchValues
  inline def ia64: ia64 = "ia64".asInstanceOf[ia64]
  
  @js.native
  sealed trait iden
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def iden: iden = "iden".asInstanceOf[iden]
  
  @js.native
  sealed trait informix
    extends StObject
       with DbSystemValues
  inline def informix: informix = "informix".asInstanceOf[informix]
  
  @js.native
  sealed trait ingres
    extends StObject
       with DbSystemValues
  inline def ingres: ingres = "ingres".asInstanceOf[ingres]
  
  @js.native
  sealed trait inproc
    extends StObject
       with NetTransportValues
  inline def inproc: inproc = "inproc".asInstanceOf[inproc]
  
  @js.native
  sealed trait insert
    extends StObject
       with FaasDocumentOperationValues
  inline def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait instantdb
    extends StObject
       with DbSystemValues
  inline def instantdb: instantdb = "instantdb".asInstanceOf[instantdb]
  
  @js.native
  sealed trait interbase
    extends StObject
       with DbSystemValues
  inline def interbase: interbase = "interbase".asInstanceOf[interbase]
  
  @js.native
  sealed trait ip
    extends StObject
       with NetTransportValues
  inline def ip: ip = "ip".asInstanceOf[ip]
  
  @js.native
  sealed trait ip_tcp
    extends StObject
       with NetTransportValues
  inline def ip_tcp: ip_tcp = "ip_tcp".asInstanceOf[ip_tcp]
  
  @js.native
  sealed trait ip_udp
    extends StObject
       with NetTransportValues
  inline def ip_udp: ip_udp = "ip_udp".asInstanceOf[ip_udp]
  
  @js.native
  sealed trait iwlan
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def iwlan: iwlan = "iwlan".asInstanceOf[iwlan]
  
  @js.native
  sealed trait java_
    extends StObject
       with TelemetrySdkLanguageValues
  inline def java_ : java_ = "java".asInstanceOf[java_]
  
  @js.native
  sealed trait linux
    extends StObject
       with OsTypeValues
  inline def linux: linux = "linux".asInstanceOf[linux]
  
  @js.native
  sealed trait local_one
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def local_one: local_one = "local_one".asInstanceOf[local_one]
  
  @js.native
  sealed trait local_quorum
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def local_quorum: local_quorum = "local_quorum".asInstanceOf[local_quorum]
  
  @js.native
  sealed trait local_serial
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def local_serial: local_serial = "local_serial".asInstanceOf[local_serial]
  
  @js.native
  sealed trait lte
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def lte: lte = "lte".asInstanceOf[lte]
  
  @js.native
  sealed trait lte_ca
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def lte_ca: lte_ca = "lte_ca".asInstanceOf[lte_ca]
  
  @js.native
  sealed trait mariadb
    extends StObject
       with DbSystemValues
  inline def mariadb: mariadb = "mariadb".asInstanceOf[mariadb]
  
  @js.native
  sealed trait maxdb
    extends StObject
       with DbSystemValues
  inline def maxdb: maxdb = "maxdb".asInstanceOf[maxdb]
  
  @js.native
  sealed trait memcached
    extends StObject
       with DbSystemValues
  inline def memcached: memcached = "memcached".asInstanceOf[memcached]
  
  @js.native
  sealed trait mongodb
    extends StObject
       with DbSystemValues
  inline def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  
  @js.native
  sealed trait mssql
    extends StObject
       with DbSystemValues
  inline def mssql: mssql = "mssql".asInstanceOf[mssql]
  
  @js.native
  sealed trait mysql
    extends StObject
       with DbSystemValues
  inline def mysql: mysql = "mysql".asInstanceOf[mysql]
  
  @js.native
  sealed trait neo4j
    extends StObject
       with DbSystemValues
  inline def neo4j: neo4j = "neo4j".asInstanceOf[neo4j]
  
  @js.native
  sealed trait netbsd
    extends StObject
       with OsTypeValues
  inline def netbsd: netbsd = "netbsd".asInstanceOf[netbsd]
  
  @js.native
  sealed trait netezza
    extends StObject
       with DbSystemValues
  inline def netezza: netezza = "netezza".asInstanceOf[netezza]
  
  @js.native
  sealed trait nodejs
    extends StObject
       with TelemetrySdkLanguageValues
  inline def nodejs: nodejs = "nodejs".asInstanceOf[nodejs]
  
  @js.native
  sealed trait nr
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def nr: nr = "nr".asInstanceOf[nr]
  
  @js.native
  sealed trait nrnsa
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def nrnsa: nrnsa = "nrnsa".asInstanceOf[nrnsa]
  
  @js.native
  sealed trait one
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def one: one = "one".asInstanceOf[one]
  
  @js.native
  sealed trait openbsd
    extends StObject
       with OsTypeValues
  inline def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  
  @js.native
  sealed trait oracle
    extends StObject
       with DbSystemValues
  inline def oracle: oracle = "oracle".asInstanceOf[oracle]
  
  @js.native
  sealed trait other
    extends StObject
       with FaasTriggerValues
       with NetTransportValues
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait other_sql
    extends StObject
       with DbSystemValues
  inline def other_sql: other_sql = "other_sql".asInstanceOf[other_sql]
  
  @js.native
  sealed trait pervasive
    extends StObject
       with DbSystemValues
  inline def pervasive: pervasive = "pervasive".asInstanceOf[pervasive]
  
  @js.native
  sealed trait php
    extends StObject
       with TelemetrySdkLanguageValues
  inline def php: php = "php".asInstanceOf[php]
  
  @js.native
  sealed trait pipe
    extends StObject
       with NetTransportValues
  inline def pipe: pipe = "pipe".asInstanceOf[pipe]
  
  @js.native
  sealed trait pointbase
    extends StObject
       with DbSystemValues
  inline def pointbase: pointbase = "pointbase".asInstanceOf[pointbase]
  
  @js.native
  sealed trait postgresql
    extends StObject
       with DbSystemValues
  inline def postgresql: postgresql = "postgresql".asInstanceOf[postgresql]
  
  @js.native
  sealed trait ppc32
    extends StObject
       with HostArchValues
  inline def ppc32: ppc32 = "ppc32".asInstanceOf[ppc32]
  
  @js.native
  sealed trait ppc64
    extends StObject
       with HostArchValues
  inline def ppc64: ppc64 = "ppc64".asInstanceOf[ppc64]
  
  @js.native
  sealed trait process
    extends StObject
       with MessagingOperationValues
  inline def process: process = "process".asInstanceOf[process]
  
  @js.native
  sealed trait progress
    extends StObject
       with DbSystemValues
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait pubsub
    extends StObject
       with FaasTriggerValues
  inline def pubsub: pubsub = "pubsub".asInstanceOf[pubsub]
  
  @js.native
  sealed trait python
    extends StObject
       with TelemetrySdkLanguageValues
  inline def python: python = "python".asInstanceOf[python]
  
  @js.native
  sealed trait queue
    extends StObject
       with MessagingDestinationKindValues
  inline def queue: queue = "queue".asInstanceOf[queue]
  
  @js.native
  sealed trait quorum
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def quorum: quorum = "quorum".asInstanceOf[quorum]
  
  @js.native
  sealed trait receive
    extends StObject
       with MessagingOperationValues
  inline def receive: receive = "receive".asInstanceOf[receive]
  
  @js.native
  sealed trait redis
    extends StObject
       with DbSystemValues
  inline def redis: redis = "redis".asInstanceOf[redis]
  
  @js.native
  sealed trait redshift
    extends StObject
       with DbSystemValues
  inline def redshift: redshift = "redshift".asInstanceOf[redshift]
  
  @js.native
  sealed trait ruby
    extends StObject
       with TelemetrySdkLanguageValues
  inline def ruby: ruby = "ruby".asInstanceOf[ruby]
  
  @js.native
  sealed trait serial
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def serial: serial = "serial".asInstanceOf[serial]
  
  @js.native
  sealed trait solaris
    extends StObject
       with OsTypeValues
  inline def solaris: solaris = "solaris".asInstanceOf[solaris]
  
  @js.native
  sealed trait sqlite
    extends StObject
       with DbSystemValues
  inline def sqlite: sqlite = "sqlite".asInstanceOf[sqlite]
  
  @js.native
  sealed trait sybase
    extends StObject
       with DbSystemValues
  inline def sybase: sybase = "sybase".asInstanceOf[sybase]
  
  @js.native
  sealed trait td_scdma
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def td_scdma: td_scdma = "td_scdma".asInstanceOf[td_scdma]
  
  @js.native
  sealed trait teradata
    extends StObject
       with DbSystemValues
  inline def teradata: teradata = "teradata".asInstanceOf[teradata]
  
  @js.native
  sealed trait three
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def three: three = "three".asInstanceOf[three]
  
  @js.native
  sealed trait timer
    extends StObject
       with FaasTriggerValues
  inline def timer: timer = "timer".asInstanceOf[timer]
  
  @js.native
  sealed trait topic
    extends StObject
       with MessagingDestinationKindValues
  inline def topic: topic = "topic".asInstanceOf[topic]
  
  @js.native
  sealed trait two
    extends StObject
       with DbCassandraConsistencyLevelValues
  inline def two: two = "two".asInstanceOf[two]
  
  @js.native
  sealed trait umts
    extends StObject
       with NetHostConnectionSubtypeValues
  inline def umts: umts = "umts".asInstanceOf[umts]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with NetHostConnectionTypeValues
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unix
    extends StObject
       with NetTransportValues
  inline def unix: unix = "unix".asInstanceOf[unix]
  
  @js.native
  sealed trait unknown
    extends StObject
       with NetHostConnectionTypeValues
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait vertica
    extends StObject
       with DbSystemValues
  inline def vertica: vertica = "vertica".asInstanceOf[vertica]
  
  @js.native
  sealed trait webjs
    extends StObject
       with TelemetrySdkLanguageValues
  inline def webjs: webjs = "webjs".asInstanceOf[webjs]
  
  @js.native
  sealed trait wifi
    extends StObject
       with NetHostConnectionTypeValues
  inline def wifi: wifi = "wifi".asInstanceOf[wifi]
  
  @js.native
  sealed trait windows
    extends StObject
       with OsTypeValues
  inline def windows: windows = "windows".asInstanceOf[windows]
  
  @js.native
  sealed trait wired
    extends StObject
       with NetHostConnectionTypeValues
  inline def wired: wired = "wired".asInstanceOf[wired]
  
  @js.native
  sealed trait x86
    extends StObject
       with HostArchValues
  inline def x86: x86 = "x86".asInstanceOf[x86]
  
  @js.native
  sealed trait z_os
    extends StObject
       with OsTypeValues
  inline def z_os: z_os = "z_os".asInstanceOf[z_os]
}
